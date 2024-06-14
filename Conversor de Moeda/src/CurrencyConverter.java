public class CurrencyConverter {
    double valorAtualDolar, valorConverter;

    public static double calcular(double valorAtualDolar, double valorConverter){

        double valorConvertido = ((valorAtualDolar * valorConverter) + 0.06);
        return valorConvertido;
    }
}
