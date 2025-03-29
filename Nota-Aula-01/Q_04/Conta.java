package Q_04;

import java.util.Scanner;

public class Conta {

    String titular;
    double saldo;

    public Conta(String titular, double saldo) {
        this.saldo = 0.0;
        this.titular = titular;
    }

    public Conta() {

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void consultaSaldo() {

        System.out.printf("Saldo: R$ %.2f%n", this.saldo);
    }

    public void Depositar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do depósito: ");
        double deposito = sc.nextDouble();
        this.setSaldo(this.getSaldo() + deposito);
        consultaSaldo();
    }

    public void Sacar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do saque: ");
        double saque = sc.nextDouble();
        this.setSaldo(this.getSaldo() - saque);
        consultaSaldo();
    }

    public void Transferir() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da tranferência: ");
        double transferencia = sc.nextDouble();
        this.setSaldo(this.getSaldo() - transferencia);
        consultaSaldo();
    }
}
