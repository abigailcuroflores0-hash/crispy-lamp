import java.util.Scanner;

public class ComparacionProduccion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese producción de la fábrica 1: ");
        int produccion1 = entrada.nextInt();

        System.out.print("Ingrese producción de la fábrica 2: ");
        int produccion2 = entrada.nextInt();

        System.out.println(produccion1 + " es mayor que " + produccion2 + ": " + (produccion1 > produccion2));
        System.out.println(produccion1 + " es menor que " + produccion2 + ": " + (produccion1 < produccion2));
        System.out.println(produccion1 + " es mayor o igual que " + produccion2 + ": " + (produccion1 >= produccion2));
        System.out.println(produccion1 + " es menor o igual que " + produccion2 + ": " + (produccion1 <= produccion2));
        System.out.println(produccion1 + " es igual a " + produccion2 + ": " + (produccion1 == produccion2));
        System.out.println(produccion1 + " es diferente de " + produccion2 + ": " + (produccion1 != produccion2));

        if (produccion1 > produccion2) {
            System.out.println("La fábrica 1 produjo más.");
        } else if (produccion2 > produccion1) {
            System.out.println("La fábrica 2 produjo más.");
        } else {
            System.out.println("Ambas fábricas produjeron lo mismo.");
        }

        System.out.println("Diferencia de producción: " + Math.abs(produccion1 - produccion2) + " unidades.");

    }
}
