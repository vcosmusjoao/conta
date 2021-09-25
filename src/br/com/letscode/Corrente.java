package br.com.letscode;

public class Corrente extends Conta {

    public Corrente() {
    }

    public Corrente(TipoCliente tipoCliente, int numConta, String nome, double saldo) {
        super(tipoCliente, numConta, nome, saldo);
    }

    public void depositar(double valor){
        if(valor>0){
            this.saldo+=valor;
        }
    }


    }


