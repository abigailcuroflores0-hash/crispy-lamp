public class ComisionVenta {
    public static void main(String[] args) {

        double venta = 12500;
        double comision = 6;
        double sueldoBase = 1400;

        double montoComision = venta * comision / 100;
        double ingresoTotal = sueldoBase + montoComision;

        System.out.println("Comisión: S/ " + montoComision);
        System.out.println("Ingreso total: S/ " + ingresoTotal);
    }
}