import java.util.Scanner;

public class ComparacionBeca {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese promedio del estudiante 1: ");
        double promedio1 = entrada.nextDouble();

        System.out.print("Ingrese promedio del estudiante 2: ");
        double promedio2 = entrada.nextDouble();

        System.out.println(promedio1 + " es mayor que " + promedio2 + ": " + (promedio1 > promedio2));
        System.out.println(promedio1 + " es menor que " + promedio2 + ": " + (promedio1 < promedio2));
        System.out.println(promedio1 + " es mayor o igual que " + promedio2 + ": " + (promedio1 >= promedio2));
        System.out.println(promedio1 + " es menor o igual que " + promedio2 + ": " + (promedio1 <= promedio2));
        System.out.println(promedio1 + " es igual a " + promedio2 + ": " + (promedio1 == promedio2));
        System.out.println(promedio1 + " es diferente de " + promedio2 + ": " + (promedio1 != promedio2));

        if (promedio1 > promedio2) {
            System.out.println("El estudiante 1 obtiene la beca.");
        } else if (promedio2 > promedio1) {
            System.out.println("El estudiante 2 obtiene la beca.");
        } else {
            System.out.println("Ambos estudiantes tienen el mismo promedio.");
        }

    }
}