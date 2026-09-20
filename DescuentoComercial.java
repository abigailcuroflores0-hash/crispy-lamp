public class DescuentoComercial {
    public static void main(String[] args) {

        double precio = 1200;
        double descuento = 15;

        double montoDescuento = precio * descuento / 100;
        double precioFinal = precio - montoDescuento;

        System.out.println("Descuento: S/ " + montoDescuento);
        System.out.println("Precio final: S/ " + precioFinal);
    }
}