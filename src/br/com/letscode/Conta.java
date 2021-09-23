package br.com.letscode;

public class Conta {

   private String tipoCliente;
    private int numConta;
    private String nome;
    private double saldo;


    public Conta() {
    }

    public Conta(String tipoCliente, int numConta, String nome, double saldo) {
        this.tipoCliente = tipoCliente;
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }


    public String setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
        return tipoCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta(int i) {
        return numConta;
    }

    public int setNumConta(int numConta) {
        this.numConta = numConta;
        return numConta;
    }

    public String getNome(String next) {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int setSaldo(int saldo) {
        this.saldo = saldo;
        return saldo;
    }


    public void depositar(double valor){
        if(valor>0){
            saldo=saldo+valor;
        }

    }
    public void sacar(double valor){
        double resultado= saldo-valor;
        if(resultado>=0){
            saldo=resultado;
        }
    }
    public double consultarSaldo(){
        return saldo;
    }




}
