public class PrecioConIGV {
    public static void main(String[] args) {

        double valorVenta = 850;
        double igv = 18;

        double montoIGV = valorVenta * igv / 100;
        double precioTotal = valorVenta + montoIGV;

        System.out.println("IGV: S/ " + montoIGV);
        System.out.println("Precio total: S/ " + precioTotal);
    }
}