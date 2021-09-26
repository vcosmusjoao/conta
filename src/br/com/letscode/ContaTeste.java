package br.com.letscode;

import java.util.List;

public class ContaTeste {
    private Banco banco = new Banco();

    public static void main(String[] args) {
        ContaTeste teste = new ContaTeste();
        teste.iniciar();
    }

    private void iniciar() {
        criarContas();

        List<Conta> contas = banco.listarContas();

//        for (Conta conta : contas) {
//            System.out.println(conta);
//        }
    }

    private void criarContas() {
        banco.adicionarConta(new Poupanca(TipoCliente.PF, 1, "Lauredi", 500));
        banco.adicionarConta(new Corrente(TipoCliente.PJ, 2, "Leo", 500));
        banco.adicionarConta(new Corrente(TipoCliente.PF, 3, "Victor", 500));
        banco.adicionarConta(new Investimento(TipoCliente.PJ, 4, "Lidia", 500));
        banco.adicionarConta(new Investimento(TipoCliente.PF, 5, "Kauan", 500));
    }
}
