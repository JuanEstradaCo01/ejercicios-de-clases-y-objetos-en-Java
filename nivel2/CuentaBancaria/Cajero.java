package nivel2.CuentaBancaria; //Se comenta para compilar

import java.util.Scanner;

public class Cajero {

    public static class CuentaBancaria {

        String titular;
        double saldo;

        CuentaBancaria(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }

        void mostrarSaldo() {
            System.out.println(String.format("El saldo de la cuenta de %s es: %.2f", this.titular, this.saldo));
        }

        void depositar(double monto) {
            this.saldo += monto;
            System.out.println(String.format("Se han depositado %.2f en la cuenta de %s. Nuevo saldo: %.2f", monto,
                    this.titular, this.saldo));
        }

        void retirar(double monto) {
            if (monto > this.saldo) {
                System.out.println("Fondos insuficientes para realizar el retiro.");
            } else {
                this.saldo -= monto;
                System.out.println(String.format("Se han retirado %.2f de la cuenta de %s. Nuevo saldo: %.2f", monto,
                        this.titular, this.saldo));
            }
        }

    }

    // Clase MAIN
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String titular;
        double saldoInicial = 2500;
        int montoDepositar;
        int montoRetirar;

        System.out.println("Ingresa tu nombre");
        titular = input.nextLine();

        System.out.println("Ingresa el monto a depositar");
        montoDepositar = input.nextInt();

        System.out.println("Ingresa el monto a retirar");
        montoRetirar = input.nextInt();

        CuentaBancaria cuenta = new CuentaBancaria(titular, saldoInicial);

        // Mostrar saldo inicial
        cuenta.mostrarSaldo();

        // Depositar dinero
        cuenta.depositar(montoDepositar);

        // Retirar dinero
        cuenta.retirar(montoRetirar);

        input.close();
    }

}
