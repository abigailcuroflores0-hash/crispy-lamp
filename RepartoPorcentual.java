public class RepartoPorcentual {
    public static void main(String[] args) {

        double total = 9000;
        double porcentaje1 = 40;
        double porcentaje2 = 35;
        double porcentaje3 = 25;

        double cantidad1 = total * porcentaje1 / 100;
        double cantidad2 = total * porcentaje2 / 100;
        double cantidad3 = total * porcentaje3 / 100;

        System.out.println("Participante 1: S/ " + cantidad1);
        System.out.println("Participante 2: S/ " + cantidad2);
        System.out.println("Participante 3: S/ " + cantidad3);
    }
}