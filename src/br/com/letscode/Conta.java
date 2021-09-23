package br.com.letscode;

public class Conta {

    private String tipoCliente;
    private int numConta;
    private String nome;
    private int saldo;


    public Conta() {
    }

    public Conta(String tipoCliente, int numConta, String nome, int saldo) {
        this.tipoCliente = tipoCliente;
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }
    

}
