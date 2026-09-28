import java.util.Scanner;

public class ComparacionConsumo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese consumo del hogar 1: ");
        double consumo1 = entrada.nextDouble();

        System.out.print("Ingrese consumo del hogar 2: ");
        double consumo2 = entrada.nextDouble();

        System.out.println(consumo1 + " es mayor que " + consumo2 + ": " + (consumo1 > consumo2));
        System.out.println(consumo1 + " es menor que " + consumo2 + ": " + (consumo1 < consumo2));
        System.out.println(consumo1 + " es mayor o igual que " + consumo2 + ": " + (consumo1 >= consumo2));
        System.out.println(consumo1 + " es menor o igual que " + consumo2 + ": " + (consumo1 <= consumo2));
        System.out.println(consumo1 + " es igual a " + consumo2 + ": " + (consumo1 == consumo2));
        System.out.println(consumo1 + " es diferente de " + consumo2 + ": " + (consumo1 != consumo2));

        if (consumo1 > consumo2) {
            System.out.println("El hogar 1 consumió más energía.");
        } else if (consumo2 > consumo1) {
            System.out.println("El hogar 2 consumió más energía.");
        } else {
            System.out.println("Ambos hogares consumieron la misma cantidad de energía.");
        }

        System.out.println("La diferencia es de " + Math.abs(consumo1 - consumo2) + " kWh.");

    }
}