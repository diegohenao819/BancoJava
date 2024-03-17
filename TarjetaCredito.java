import java.util.Date;

class TarjetaCredito extends ProductoBancario {
    private Date fechaVencimiento;
    private double cupo;
    private double valorUtilizado;
    private double interes;

    // Constructor
    public TarjetaCredito(Cliente cliente, String numeroCuenta, Date fechaApertura, Date fechaVencimiento,
            double cupo, double valorUtilizado, double interes) {
        super(cliente, numeroCuenta, fechaApertura, valorUtilizado);
        this.fechaVencimiento = fechaVencimiento;
        this.cupo = cupo;
        this.valorUtilizado = valorUtilizado;
        this.interes = interes;
    }

    // Sobrescritura del método calcularInteresesMensuales
    @Override
    public void calcularInteresesMensuales() {
        double interesesGenerados = valorUtilizado * (interes / 100);
        if (saldo + interesesGenerados > cupo) {
            System.out.println("El cálculo de intereses excede el cupo de la tarjeta.");
        } else {
            saldo += interesesGenerados;
        }
    }

    // Getters y setters
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getCupo() {
        return cupo;
    }

    public void setCupo(double cupo) {
        this.cupo = cupo;
    }

    public double getValorUtilizado() {
        return valorUtilizado;
    }

    public void setValorUtilizado(double valorUtilizado) {
        if (valorUtilizado > cupo) {
            System.out.println("El valor utilizado no puede exceder el cupo de la tarjeta.");
        } else {
            this.valorUtilizado = valorUtilizado;
            this.saldo = valorUtilizado;
        }
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    // Sobrescritura del getter de saldo para reflejar el concepto de tarjeta de crédito
    @Override
    public double getSaldo() {
        return saldo;
    }

    // Sobrescritura del setter de saldo para controlar la lógica específica de una tarjeta de crédito
    @Override
    public void setSaldo(double saldo) {
        if (saldo <= cupo) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede exceder el cupo de la tarjeta.");
        }
    }
}
