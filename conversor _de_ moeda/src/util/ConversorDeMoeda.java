package util;

public class ConversorDeMoeda {

    public static double IOF = 0.06;

    public static double dolarParaReal(double montante, double cotacaoDolar) {
        return montante * cotacaoDolar * (1.0 + IOF);
    }
}
