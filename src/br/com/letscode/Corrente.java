package br.com.letscode;

public class Corrente extends Conta {

    public Corrente() {
    }

    public Corrente(TipoCliente tipoCliente, int numConta, String nome, double saldo) {
        super(tipoCliente, numConta, nome, saldo);
    }

    public void depositar(double valor){
        if(valor > 0){
            super.saldo += valor;
        }
    }

    public void sacar(double valor){

        double resultado;
        if(valor>0 && super.getTipoCliente()==TipoCliente.PF){
            resultado = saldo-valor ;
        }if(valor>0 && super.getTipoCliente()==TipoCliente.PJ){
            resultado = saldo-(valor*1.005);
        }else{
            System.out.println("Você não possui saldo para sacar esse valor");

        }
    }

    public void transferencia(double valor){
        double resultado = super.saldo - valor;
        if(resultado >= 0){
            super.saldo = resultado;
        }
    }
}


