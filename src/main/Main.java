package main;

import model.ContaBancariaModel;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ContaBancariaModel conta1 = new ContaBancariaModel();
        Scanner sc= new Scanner(System.in);

        System.out.print("Informe os numeros da conta: ");
        String numeroConta = sc.next();
        conta1.setNumeroDoTitular(numeroConta);
        System.out.print("Informe o nome do titular: ");
        conta1.nomeDaConta = sc.next();
        sc.nextLine();

        System.out.println("Vai realizar seu primeiro deposito(y/n) ?");
        char escolha = sc.next().charAt(0);
        if (escolha == 'y'){
            System.out.print("Informe seu deposito inicial:");
            float deposito = sc.nextFloat();
            conta1.depositarDinheiro(deposito);
        } else if (escolha == 'n') {
            System.out.println("Pode continuar mesmo sem fazer seu primeiro deposito!");
        }
        System.out.println("Informacoes atuais da conta: ");
        System.out.println(conta1);

        System.out.println("Deseja depositar uma quantia (y/n)?");
        char escolha2 = sc.next().charAt(0);
        if(escolha2== 'y'){
            System.out.print("Informe a quantia que deseja depositar:");
            float quantiaDepositada = sc.nextFloat();
            conta1.depositarDinheiro(quantiaDepositada);
        }
        System.out.println("Informacoes da conta: ");
        System.out.println(conta1);

        System.out.print("Deseja sacar alguma quantia ? (y/n)");
        char escolha3 = sc.next().charAt(0);
        if (escolha3 == 'y'){
            System.out.print("Sera cobrado uma taxa a cada saque!\nInforme o valor do saque:");
            float saqueDinheiro = sc.nextFloat();
            conta1.sacarDoDinheiro(saqueDinheiro);
        }
        System.out.println("Informacoes da conta: ");
        System.out.println(conta1);

        sc.close();
    }
}
