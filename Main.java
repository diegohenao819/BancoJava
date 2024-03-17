import java.util.Calendar;
import java.util.Date;

public class Main {
        public static void main(String[] args) {
                // Crear un cliente
                Cliente cliente = new Cliente("123456789", "Diego Henao", "diegohenao819@gmail.com", "3001234567",
                                "Calle Falsa 123");

                // Obtener la fecha actual para la apertura de los productos bancarios
                Date fechaApertura = new Date();

                // Obtener la fecha de vencimiento de la tarjeta de crédito
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(fechaApertura);
                calendar.add(Calendar.YEAR, 3);
                Date fechaVencimientoTarjeta = calendar.getTime();

                // Crear una cuenta de ahorro
                CuentaAhorro cuentaAhorro = new CuentaAhorro(cliente, "ahorro123", fechaApertura, 10000, 1.5);

                // Crear una cuenta corriente
                CuentaCorriente cuentaCorriente = new CuentaCorriente(cliente, "corriente123", fechaApertura, 10000,
                                0.5,
                                100000);

                // Crear un CDT
                CDT cdt = new CDT(cliente, "77777777", fechaApertura, 10000, "CDT123", 12, 10000, 20);

                // Crear una tarjeta de crédito
                TarjetaCredito tarjetaCredito = new TarjetaCredito(cliente, "credito123", fechaApertura,
                                fechaVencimientoTarjeta,
                                500000, 250000, 1.9);

                // Calcular y mostrar intereses y saldo para cada producto
                cuentaAhorro.calcularInteresesMensuales();
                System.out.println("Saldo cuenta ahorro después de intereses: " + cuentaAhorro.getSaldo());

                cuentaCorriente.calcularInteresesMensuales();
                System.out.println("Saldo cuenta corriente después de intereses: " + cuentaCorriente.getSaldo());

                System.out.println("Valor a recibir al final del CDT: " + cdt.calcularValorFinal());

                tarjetaCredito.calcularInteresesMensuales();
                System.out.println("Saldo tarjeta de crédito después de intereses: " + tarjetaCredito.getSaldo());

        }
}
