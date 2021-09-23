package br.com.letscode;

public class Poupanca extends Conta {

    public Poupanca() {
    }

    public Poupanca(String tipoCliente, int numConta, String nome, double saldo) {
        super(tipoCliente, numConta, nome, saldo);
    }

    public void depositar(double valor){
        if(valor>0){
            double saldoCP=super.getSaldo()+valor;
        }
    }

    public void sacar(double valor){
        double resultado=super.getSaldo()-valor;
        if(resultado>0){
            super.setSaldo(super.getSaldo()-valor);
        }
    }
}
