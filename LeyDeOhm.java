public class LeyDeOhm {
    public static void main(String[] args) {

        double voltaje = 220;
        double resistencia = 44;

        double corriente = voltaje / resistencia;

        System.out.println("Corriente: " + corriente + " A");
    }
}