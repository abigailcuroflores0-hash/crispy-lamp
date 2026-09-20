public class ConversionSegundos {
    public static void main(String[] args) {

        int segundosTotales = 10000;

        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos restantes: " + segundos);
    }
}