/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CurrencyConverter {

    private static final String API_KEY = "607434fcdeb845a0b3532eb03cee9664";
    private static final String BASE_URL = "http://data.fixer.io/api/";

    public static double convertCurrency(String from, String to, double amount) {
        HttpClient client = HttpClient.newHttpClient();
        String url = BASE_URL + "latest?access_key=" + API_KEY
                + "&base=" + from
                + "&symbols=" + to;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            if (response.statusCode() == 200) {
                return parseExchangeRate(response.body(), to) * amount;
            } else {
                throw new RuntimeException("فشل الطلب: " + response.statusCode());
            }
        } catch (Exception e) {
            throw new RuntimeException("خطأ في تحويل العملة: " + e.getMessage());
        }
    }

    private static double parseExchangeRate(String json, String targetCurrency) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);

        if (!rootNode.get("success").asBoolean()) {
            throw new RuntimeException("خطأ من API: " + rootNode.get("error").get("info"));
        }

        return rootNode.get("rates").get(targetCurrency).asDouble();
    }

    public static void main(String[] args) {
        // مثال: تحويل 100 يورو إلى دولار أمريكي
        double amountInUSD = convertCurrency("EUR", "USD", 100.0);
        System.out.println("100 يورو = " + amountInUSD + " دولار");
    }
}
