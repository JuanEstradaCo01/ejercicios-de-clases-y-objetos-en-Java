package nivel2.CuentaBancaria;

public class CuentaBancaria {

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
