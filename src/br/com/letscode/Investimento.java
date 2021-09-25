package br.com.letscode;

public class Investimento extends Conta {

    public Investimento() {
    }

    public Investimento(TipoCliente tipoCliente, int numConta, String nome, double saldo) {
        super(tipoCliente, numConta, nome, saldo);
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
}
