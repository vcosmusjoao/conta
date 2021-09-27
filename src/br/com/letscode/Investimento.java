package br.com.letscode;

public class Investimento extends Conta {
    public Investimento(TipoCliente tipoCliente, int numConta, String nome, double saldo) {
        super(tipoCliente, numConta, nome, saldo);
    }

    public void sacar(double valor){
        double resultado = super.saldo - valor;
        if(resultado >= 0){
            if (super.getTipoCliente() == TipoCliente.PJ) {
                resultado -= (valor * 0.02);
            }

            super.saldo = resultado;
        }
        else {
            System.out.println("Você não possui saldo para sacar esse valor");
        }
    }

    public void investir(double valor) {
        if (valor > 0) {
            if (super.getTipoCliente() == TipoCliente.PJ) {
                valor += valor * 0.02;
            }

            super.depositar(valor);
        }
    }

    public void transferencia(Conta conta, double valor){
        double resultado = super.saldo - valor;
        if(resultado >= 0){
            if (super.getTipoCliente() == TipoCliente.PJ) {
                resultado -= (valor * 0.005);
            }

            conta.depositar(valor);
            super.saldo = resultado;
        }
        else {
            System.out.println("Você não possui saldo para transferir esse valor");
        }
    }
}
