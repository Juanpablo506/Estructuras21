public class objVehiculo {
    private String marca;
    private String tipo;
    private int cilindraje;
    private double pagoAnterior;
    private double pagoActual;
    private int numeroCelda;

    public objVehiculo(String marca, String tipo, int cilindraje, double pagoAnterior, double pagoActual,
            int numeroCelda) {
        this.marca = marca;
        this.tipo = tipo;
        this.cilindraje = cilindraje;
        this.pagoAnterior = pagoAnterior;
        this.pagoActual = pagoActual;
        this.numeroCelda = numeroCelda;
    }

    public objVehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getPagoAnterior() {
        return pagoAnterior;
    }

    public void setPagoAnterior(double pagoAnterior) {
        this.pagoAnterior = pagoAnterior;
    }

    public double getPagoActual() {
        return pagoActual;
    }

    public void setPagoActual(double pagoActual) {
        this.pagoActual = pagoActual;
    }

    public int getNumeroCelda() {
        return numeroCelda;
    }

    public void setNumeroCelda(int numeroCelda) {
        this.numeroCelda = numeroCelda;
    }

    
    
}
