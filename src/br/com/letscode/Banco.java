package br.com.letscode;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public Banco() {}

    public void adicionarConta(Conta conta) {
        if (conta instanceof Poupanca && conta.getTipoCliente() == TipoCliente.PJ) {
            System.out.printf("\n%s, cliente PJ não pode ter conta poupança.\n\n", conta.getNome());
        }
        else {
            this.contas.add(conta);
        }
    }

    public List<Conta> listarContas() {
        return contas;
    }
}
