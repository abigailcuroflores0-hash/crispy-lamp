public class PrecioVenta {
    public static void main(String[] args) {

        double costoTotal = 4625;
        double ganancia = 25;

        double montoGanancia = costoTotal * ganancia / 100;
        double precioVenta = costoTotal + montoGanancia;

        System.out.println("Ganancia: S/ " + montoGanancia);
        System.out.println("Precio de venta: S/ " + precioVenta);
    }
}