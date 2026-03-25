package Desafio;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoBancario = 1000;

        System.out.println("** Menu **");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - consultar Saldo");


        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Qual o valor que deseja depositar?");
            double valor = sc.nextDouble();
            valor += saldoBancario;

            System.out.println("Valor Atualizado: " + valor);

        }


    }
}
