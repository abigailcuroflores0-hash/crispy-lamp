public class DescomposicionTresCifras {
    public static void main(String[] args) {

        int numero = 748;

        int centenas = numero / 100;
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10;

        int sumaCifras = centenas + decenas + unidades;

        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
        System.out.println("Suma de cifras: " + sumaCifras);
    }
}