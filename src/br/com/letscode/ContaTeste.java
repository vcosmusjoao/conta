package br.com.letscode;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ContaTeste {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        Conta conta= new Conta();

         String nome=  conta.setNome("João");
         String tipoCliente=conta.setTipoCliente("PF");
         int numConta= conta.setNumConta(001);
         int saldoConta=conta.setSaldo(100);



        System.out.println("Qual tipo de conta ? POUPANÇA, CORRENTE OU INVESTIMENTO");
        char opcao=sc.next().charAt(0);



        if(conta.getTipoCliente()=="PF" && opcao=='P'){
            conta= new Poupanca();
            System.out.println("Informações da conta:");
            System.out.println("Nome: "+nome);
            System.out.println("Numero da Conta: "+ numConta);
            System.out.println("Saldo atual: "+saldoConta);

        }else if(conta.getTipoCliente()=="PJ" && opcao=='P'){
            System.out.println("Cliente Pessoa Juridica não pode abrir conta poupança");
        }




        if(conta.getTipoCliente()=="PF" && opcao=='I'){
            conta= new Investimento();
            conta.depositar(200);
            System.out.println(nome+" seu saldo é de "+ conta.consultarSaldo());
            conta.sacar(20);
            System.out.println(nome+ " seu novo saldo é de "+ conta.consultarSaldo());
        }else if(conta.getTipoCliente()=="PJ"&& opcao=='I'){
            conta= new Investimento();
            conta.depositar(800);
            System.out.println(nome+" seu saldo é de "+ conta.consultarSaldo());


        }


        conta.depositar(500);
        System.out.println("Seu novo saldo é:"+conta.consultarSaldo());










    }
}
