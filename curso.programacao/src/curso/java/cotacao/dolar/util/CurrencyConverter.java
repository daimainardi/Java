package curso.java.cotacao.dolar.util;

public class CurrencyConverter {
    private static final double IOF = 0.06;
    public static double converter(double dollarValue, double dollarQuotation) {
        double reais = dollarValue * dollarQuotation;
        double convertedValuePlusTaxes = reais * (1 + IOF);
        return convertedValuePlusTaxes;

    }
}
