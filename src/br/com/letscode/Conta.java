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

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
