
public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser null o vacía.");
        }
        int currentYear = java.time.Year.now().getValue();
        if (anio <= 1900 || anio > currentYear) {
            throw new IllegalArgumentException("El año debe ser mayor a 1900 y menor o igual al año actual.");
        }
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser positiva.");
        }
        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    // Getters y setters

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser null o vacía.");
        }
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        int currentYear = java.time.Year.now().getValue();
        if (anio <= 1900 || anio > currentYear) {
            throw new IllegalArgumentException("El año debe ser mayor a 1900 y menor o igual al año actual.");
        }
        this.anio = anio;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser positiva.");
        }
        this.capacidadCargaKg = capacidadCargaKg;
    }

    /**
     * Imprime la información del vehículo.
     */
    public void mostrarInformacion() {
        System.out.println("----- Información del Vehículo -----");
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio);
        System.out.println("Capacidad de carga (Kg): " + capacidadCargaKg);
    }

}
