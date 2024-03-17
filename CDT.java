import java.util.Date;

// Clase CDT
class CDT extends ProductoBancario {
    private String numeroCDT;
    private int numeroMeses;
    private double valor;
    private double interesMensual;

    public CDT(Cliente cliente, String numeroCuenta, Date fechaApertura, double saldo,
            String numeroCDT, int numeroMeses, double valor, double interesMensual) {
        super(cliente, numeroCuenta, fechaApertura, saldo);
        if (numeroMeses <= 0) {
            throw new IllegalArgumentException("El número de meses debe ser positivo");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("El valor debe ser positivo");
        }
        this.numeroCDT = numeroCDT;
        this.numeroMeses = numeroMeses;
        this.valor = valor;
        this.interesMensual = interesMensual;
    }

    // Este método se sobrescribe pero no es aplicable para CDT.
    @Override
    public void calcularInteresesMensuales() {
        System.out.println("No se calculan intereses mensuales para CDT");
    }

    public double calcularValorFinal() {
        double intereses = valor * (interesMensual / 100) * numeroMeses;
        return valor + intereses;
    }

    // Getters y setters para los atributos del CDT
    public String getNumeroCDT() {
        return numeroCDT;
    }

    public void setNumeroCDT(String numeroCDT) {
        this.numeroCDT = numeroCDT;
    }

    public int getNumeroMeses() {
        return numeroMeses;
    }

    public void setNumeroMeses(int numeroMeses) {
        if (numeroMeses <= 0) {
            System.out.println("El número de meses debe ser positivo");
        }
        this.numeroMeses = numeroMeses;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            System.out.println("El valor debe ser positivo");
        }
        this.valor = valor;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }
}
