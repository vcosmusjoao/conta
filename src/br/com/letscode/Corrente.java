package br.com.letscode;

public class Corrente extends Conta {
    public Corrente(TipoCliente tipoCliente, int numConta, String nome, double saldo) {
        super(tipoCliente, numConta, nome, saldo);
    }

    public void depositar(double valor){
        if(valor > 0){
            super.saldo += valor;
        }
    }

    public void sacar(double valor){
        double resultado = 0;
        if(valor > 0 && super.getTipoCliente() == TipoCliente.PF){
            resultado = super.saldo - valor ;
        }else if(valor > 0 && super.getTipoCliente() == TipoCliente.PJ){
            resultado = super.saldo - (valor * 1.005);
        }else{
            System.out.println("Você não possui saldo para sacar esse valor");
        }
        super.saldo = resultado;
    }

    public void transferencia(Conta conta, double valor){
        double resultado = super.saldo - valor;
        if(resultado >= 0){
            if (super.tipoCliente == TipoCliente.PJ) {
                resultado -= (valor * 0.005);
            }

            conta.depositar(valor);
            super.saldo = resultado;
        }
    }
}


