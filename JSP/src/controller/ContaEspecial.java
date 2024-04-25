package controller;


public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
            System.out.println("Sacou R$ " + valor);
        } else {
            System.out.println("Limite de crédito excedido.");
        }
    }
}