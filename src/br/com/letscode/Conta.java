package br.com.letscode;

public class Conta {

    private TipoCliente tipoCliente;
    private int numConta;
    private String nome;
    protected double saldo;


    public Conta() {
    }

    public Conta(TipoCliente tipoCliente, int numConta, String nome, double saldo) {
        this.tipoCliente = tipoCliente;
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }


    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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
