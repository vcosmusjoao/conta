package br.com.letscode;

public class Investimento extends Conta {

    public Investimento() {
    }

    public Investimento(TipoCliente tipoCliente, int numConta, String nome, double saldo) {
        super(tipoCliente, numConta, nome, saldo);
    }

    public void sacar(double valor){
        if(valor>0){
            super.saldo += valor;
        }
    }
}
