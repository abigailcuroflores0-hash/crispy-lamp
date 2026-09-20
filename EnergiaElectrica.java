public class EnergiaElectrica {
    public static void main(String[] args) {

        double potencia = 1200;
        double tiempo = 6;

        double energiaWh = potencia * tiempo;
        double energiaKWh = energiaWh / 1000;

        System.out.println("Energía: " + energiaWh + " Wh");
        System.out.println("Energía: " + energiaKWh + " kWh");
    }
}