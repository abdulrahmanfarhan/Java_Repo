package stocks;

/**
 *
 * @author Abdulrahman_Farhan
 */
public class stock {

    private String symbol;
    private String name;
    private double previusClosingPrice;
    private double currentPrice;

    public stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        return ((currentPrice - previusClosingPrice) / previusClosingPrice) * 100;
    }

    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }

    public void setPreviousClosingPrice(double price) {
        this.previusClosingPrice = price;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getPreClosPrice() {
        return previusClosingPrice;
    }
    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }

}
