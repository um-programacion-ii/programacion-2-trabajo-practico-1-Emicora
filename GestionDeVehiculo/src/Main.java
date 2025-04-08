public class Main {
    public static void main(String[] args) {

        // Crear tres vehículos genéricos
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Fiat", 2010, 1500);
        Vehiculo vehiculo2 = new Vehiculo("DEF456", "Ford", 2012, 1600);
        Vehiculo vehiculo3 = new Vehiculo("GHI789", "Chevrolet", 2015, 2000);

        VehiculoPrinter.imprimir(vehiculo1);
        System.out.println("----------------");
        VehiculoPrinter.imprimir(vehiculo2);
        System.out.println("----------------");
        VehiculoPrinter.imprimir(vehiculo3);
    }
}