public class IndiceMasaCorporal {
    public static void main(String[] args) {

        double peso = 72;
        double altura = 1.74;

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);
    }
}