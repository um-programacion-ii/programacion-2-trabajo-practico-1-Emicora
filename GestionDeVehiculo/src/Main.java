public class Main {
    public static void main(String[] args) {

        // Crear tres vehículos genéricos
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Fiat", 2010, 1500);
        Vehiculo auto1     = new Auto("MNO345", "Honda", 2021, 800, 5);
        Camion camion1    = new Camion("JKL012", "Scania", 2018, 5000, true);

        VehiculoPrinter.imprimir(vehiculo1);
        System.out.println("----------------");
        VehiculoPrinter.imprimir(auto1);
        System.out.println("----------------");
        VehiculoPrinter.imprimir(camion1);
    }
}