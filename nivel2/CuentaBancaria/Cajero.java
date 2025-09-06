package nivel2.CuentaBancaria;

import java.util.Scanner;

public class Cajero {

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
