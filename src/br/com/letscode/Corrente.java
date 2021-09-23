package br.com.letscode;

public class Corrente extends Conta {

    public Corrente() {
    }

    public Corrente(String tipoCliente, int numConta, String nome, double saldo) {
        super(tipoCliente, numConta, nome, saldo);
    }

    public void depositar(double valor){
        if(valor>0){
            double saldoCC=super.getSaldo()+valor;
        }
    }

    public void sacar(double valor){
        double resultado=super.getSaldo()-valor;
        if(resultado>0){
            super.setSaldo(super.getSaldo()-valor);
        }
    }

}
