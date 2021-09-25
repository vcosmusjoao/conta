package br.com.letscode;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public Banco() {

    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<Conta> listarContas() {
        return contas;
    }
}
