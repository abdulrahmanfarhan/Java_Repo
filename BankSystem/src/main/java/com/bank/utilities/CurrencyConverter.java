package com.bank.utilities;

public class CurrencyConverter {
    private CurrencyConverter() {
    }

    public static double convertUSDToJOD(double USD) {
        return USD * 0.709;
    }

    public static double convertJODToUSD(double JOD) {
        return JOD / 0.709;
    }
}