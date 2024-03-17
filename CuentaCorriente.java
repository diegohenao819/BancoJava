import java.util.Date;

// Clase CuentaCorriente
class CuentaCorriente extends ProductoBancario {
    private double porcentajeInteres;
    private double valorSobregiro;

    public CuentaCorriente(Cliente cliente, String numeroCuenta, Date fechaApertura, double saldo, double porcentajeInteres, double valorSobregiro) {
        super(cliente, numeroCuenta, fechaApertura, saldo);
        this.porcentajeInteres = porcentajeInteres;
        this.valorSobregiro = valorSobregiro;
    }

    @Override
    public void calcularInteresesMensuales() {
        double intereses = saldo * (porcentajeInteres / 100);
        saldo += intereses;
    }

    // Getters y setters para porcentajeInteres y valorSobregiro
    public double getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setPorcentajeInteres(double porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }

    public double getValorSobregiro() {
        return valorSobregiro;
    }

    public void setValorSobregiro(double valorSobregiro) {
        this.valorSobregiro = valorSobregiro;
    }
}
