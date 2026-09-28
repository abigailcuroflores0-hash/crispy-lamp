import java.util.Scanner;

public class ComparacionKilometros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese kilómetros del conductor 1: ");
        double kilometros1 = entrada.nextDouble();

        System.out.print("Ingrese kilómetros del conductor 2: ");
        double kilometros2 = entrada.nextDouble();

        System.out.println(kilometros1 + " es mayor que " + kilometros2 + ": " + (kilometros1 > kilometros2));
        System.out.println(kilometros1 + " es menor que " + kilometros2 + ": " + (kilometros1 < kilometros2));
        System.out.println(kilometros1 + " es mayor o igual que " + kilometros2 + ": " + (kilometros1 >= kilometros2));
        System.out.println(kilometros1 + " es menor o igual que " + kilometros2 + ": " + (kilometros1 <= kilometros2));
        System.out.println(kilometros1 + " es igual a " + kilometros2 + ": " + (kilometros1 == kilometros2));
        System.out.println(kilometros1 + " es diferente de " + kilometros2 + ": " + (kilometros1 != kilometros2));

        if (kilometros1 > kilometros2) {
            System.out.println("El conductor 1 recorrió más kilómetros.");
        } else if (kilometros2 > kilometros1) {
            System.out.println("El conductor 2 recorrió más kilómetros.");
        } else {
            System.out.println("Ambos conductores recorrieron la misma cantidad de kilómetros.");
        }

        System.out.println("Diferencia: " + Math.abs(kilometros1 - kilometros2) + " km.");

    }
}