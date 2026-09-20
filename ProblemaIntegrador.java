public class ProblemaIntegrador {
    public static void main(String[] args) {

        int unidades = 300;
        double costoUnidad = 16.80;
        double ganancia = 30;
        double igv = 18;

        double costoTotal = unidades * costoUnidad;
        double montoGanancia = costoTotal * ganancia / 100;
        double valorVenta = costoTotal + montoGanancia;
        double montoIGV = valorVenta * igv / 100;
        double precioTotal = valorVenta + montoIGV;
        double precioFinalUnidad = precioTotal / unidades;

        System.out.println("Costo total: S/ " + costoTotal);
        System.out.println("Ganancia: S/ " + montoGanancia);
        System.out.println("Valor de venta: S/ " + valorVenta);
        System.out.println("IGV: S/ " + montoIGV);
        System.out.println("Precio total: S/ " + precioTotal);
        System.out.println("Precio final por unidad: S/ " + precioFinalUnidad);
    }
}