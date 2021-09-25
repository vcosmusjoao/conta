package br.com.letscode;

import java.math.BigDecimal;

public class Poupanca {

    private String tipoConta;
    private BigDecimal saldo, sacar, transferir, rendimentos;

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSacar() {
        return sacar;
    }

    public void setSacar(BigDecimal sacar) {
        this.sacar = sacar;
    }

    public BigDecimal getTransferir() {
        return transferir;
    }

    public void setTransferir(BigDecimal transferir) {
        this.transferir = transferir;
    }

    public BigDecimal getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(BigDecimal rendimentos) {
        this.rendimentos = rendimentos;
    }
}