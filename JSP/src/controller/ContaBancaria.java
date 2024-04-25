package controller;

public class ContaBancaria {
	protected String cliente;
    protected int num_conta;
    protected float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Sacou R$ " + valor);
        }
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depositou R$ " + valor);
    }

    public float getSaldo() {
        return saldo;
    }
}