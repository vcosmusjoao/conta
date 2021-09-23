package br.com.letscode;

public class Investimento extends Conta {

    public Investimento() {
    }

    public Investimento(String tipoCliente, int numConta, String nome, double saldo) {
        super(tipoCliente, numConta, nome, saldo);
    }

    public void sacar(double valor){
        double resultado=super.getSaldo()-valor;
        if(resultado>0){
            super.setSaldo(super.getSaldo()-valor);
        }
    }





}
