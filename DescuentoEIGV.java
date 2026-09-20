public class DescuentoEIGV {
    public static void main(String[] args) {

        double precio = 1600;
        double descuento = 10;
        double igv = 18;

        double montoDescuento = precio * descuento / 100;
        double precioConDescuento = precio - montoDescuento;

        double montoIGV = precioConDescuento * igv / 100;
        double precioFinal = precioConDescuento + montoIGV;

        System.out.println("Descuento: S/ " + montoDescuento);
        System.out.println("Precio con descuento: S/ " + precioConDescuento);
        System.out.println("IGV: S/ " + montoIGV);
        System.out.println("Precio final: S/ " + precioFinal);
    }
}