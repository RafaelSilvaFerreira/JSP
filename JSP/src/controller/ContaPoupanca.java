package controller;

public class ContaPoupanca extends ContaBancaria {
    public int diaRendimento;

    public ContaPoupanca(String cliente, int num_conta, float saldo, int diaRendimento) {
        super(cliente, num_conta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void aplicarRendimento(float taxaRendimento) {
        float rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
        System.out.println("Rendimento de R$ " + rendimento);
    }
}