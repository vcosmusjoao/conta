package br.com.letscode;

import java.util.List;

public class ContaTeste {
    private Banco banco = new Banco();
    List<Conta> contas;

    public static void main(String[] args) {
        ContaTeste teste = new ContaTeste();
        teste.iniciar();
    }

    private void iniciar() {
        criarContas();

        this.contas = this.banco.listarContas();

        for (Conta conta : contas) {
            testeOperacoes(conta);
        }
    }

    private void testeOperacoes(Conta conta) {
        System.out.println("Teste da conta\n");
        System.out.printf("%s, seu saldo é R$ %.2f\n", conta.getNome(), conta.getSaldo());
        conta.sacar(100);
        System.out.printf("Saque realizado, seu saldo é R$ %.2f\n", conta.getSaldo());

        if (conta instanceof Investimento) {
            ((Investimento) conta).investir(200);
            System.out.printf("Investimento realizado, seu saldo é R$ %.2f\n\n", conta.getSaldo());
        }
        else {
            conta.depositar(200);
            System.out.printf("Deposito realizado, seu saldo é R$ %.2f\n", conta.getSaldo());
            conta.transferencia(contas.get(4), 300);
            System.out.printf("%s, transferencia realizada, seu saldo é R$ %.2f\n",
                    conta.getNome(), conta.getSaldo());

            System.out.printf("%s, você recebeu uma transferencia, seu saldo é R$ %.2f\n\n",
                    contas.get(4).getNome(), contas.get(4).getSaldo());
        }
    }

    private void criarContas() {
        banco.adicionarConta(new Poupanca(TipoCliente.PF, 1, "Lauredi", 500));
        banco.adicionarConta(new Corrente(TipoCliente.PJ, 2, "Leo", 500));
        banco.adicionarConta(new Corrente(TipoCliente.PF, 3, "Victor", 500));
        banco.adicionarConta(new Investimento(TipoCliente.PJ, 4, "Lidia", 500));
        banco.adicionarConta(new Investimento(TipoCliente.PF, 5, "Kauan", 500));
    }
}
