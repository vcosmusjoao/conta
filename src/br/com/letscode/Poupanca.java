package br.com.letscode;

public class Poupanca extends Conta {

    public Poupanca() {
    }

    public Poupanca(TipoCliente tipoCliente, int numConta, String nome, double saldo) {
        super(tipoCliente, numConta, nome, saldo);
    }

    public void depositar(double valor){
        if(valor>0){
            this.saldo+=valor;
        }
    }
    public void sacar(double valor){
        double resultado= saldo-valor;
        if(resultado>=0){
            saldo=resultado;
        }

    }
}
