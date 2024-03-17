import java.util.Date;

// Clase CuentaAhorro
class CuentaAhorro extends ProductoBancario {
    private double porcentajeInteres;

    // Constructor
    public CuentaAhorro(Cliente cliente, String numeroCuenta, Date fechaApertura, double saldo, double porcentajeInteres) {
        super(cliente, numeroCuenta, fechaApertura, saldo);
        this.porcentajeInteres = porcentajeInteres;
    }

    // Método para calcular intereses mensuales
    @Override
    public void calcularInteresesMensuales() {
        double intereses = saldo * (porcentajeInteres / 100);
        saldo += intereses;
    }

    // Getters y setters para porcentajeInteres
    public double getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setPorcentajeInteres(double porcentajeInteres) {
        if (porcentajeInteres >= 0) {
            this.porcentajeInteres = porcentajeInteres;
        } else {
            System.out.println("El porcentaje de interés no puede ser negativo.");
        }
    }
}
