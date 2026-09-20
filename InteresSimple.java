public class InteresSimple {
    public static void main(String[] args) {

        double capital = 5000;
        double tasa = 8;
        double tiempo = 3;

        double interes = capital * (tasa / 100) * tiempo;
        double monto = capital + interes;

        System.out.println("Interés: S/ " + interes);
        System.out.println("Monto final: S/ " + monto);
    }
}