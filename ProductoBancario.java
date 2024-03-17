import java.util.Date;

// Clase abstracta ProductoBancario
abstract class ProductoBancario {
    protected Cliente cliente;
    protected String numeroCuenta;
    protected Date fechaApertura;
    protected double saldo;

    // Constructor
    public ProductoBancario(Cliente cliente, String numeroCuenta, Date fechaApertura, double saldo) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }

    // Método abstracto que las subclases deben implementar
    public abstract void calcularInteresesMensuales();

    // Getters y setters
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date getFechaApertura() {
        return this.fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
