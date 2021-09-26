package br.com.letscode;

public class Poupanca extends Conta {
    public Poupanca(TipoCliente tipoCliente, int numConta, String nome, double saldo) {
        super(tipoCliente, numConta, nome, saldo);
    }

    public void depositar(double valor){
        if(valor > 0){
            super.saldo += valor;
        }
    }

    public void sacar(double valor){
        double resultado = super.saldo - valor;
        if(resultado >= 0){
            super.saldo = resultado;
        }
    }

    public void transferencia(Conta conta, double valor){
        double resultado = super.saldo - valor;
        if(resultado >= 0){
            super.saldo = resultado;
            conta.depositar(valor);
        }
    }
}
