import java.util.Scanner;

public class ComparacionSaldos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese saldo de la cuenta 1: ");
        double saldo1 = entrada.nextDouble();

        System.out.print("Ingrese saldo de la cuenta 2: ");
        double saldo2 = entrada.nextDouble();

        System.out.println(saldo1 + " es mayor que " + saldo2 + ": " + (saldo1 > saldo2));
        System.out.println(saldo1 + " es menor que " + saldo2 + ": " + (saldo1 < saldo2));
        System.out.println(saldo1 + " es mayor o igual que " + saldo2 + ": " + (saldo1 >= saldo2));
        System.out.println(saldo1 + " es menor o igual que " + saldo2 + ": " + (saldo1 <= saldo2));
        System.out.println(saldo1 + " es igual a " + saldo2 + ": " + (saldo1 == saldo2));
        System.out.println(saldo1 + " es diferente de " + saldo2 + ": " + (saldo1 != saldo2));

        if (saldo1 > saldo2) {
            System.out.println("La cuenta 1 tiene mayor saldo.");
        } else if (saldo2 > saldo1) {
            System.out.println("La cuenta 2 tiene mayor saldo.");
        } else {
            System.out.println("Ambas cuentas tienen el mismo saldo.");
        }

        System.out.println("La diferencia es: S/ " + Math.abs(saldo1 - saldo2));

    }
}