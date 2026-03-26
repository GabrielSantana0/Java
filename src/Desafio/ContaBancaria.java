package Desafio;

import java.util.Scanner;

public class ContaBancaria {
    protected double saldoBancario = 1000;

    public void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("** Menu **");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Cobrar Tarifa");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Qual o valor que deseja depositar?");
            double valor = sc.nextDouble();
            saldoBancario += valor;
            System.out.println("Valor Atualizado: " + saldoBancario);

        } else if (opcao == 2) {
            System.out.println("Qual valor do saque?");
            double valorSaque = sc.nextDouble();
            saldoBancario -= valorSaque;
            System.out.println("Valor sacado foi : " + valorSaque);
            System.out.println("Saldo Restante: " + saldoBancario);

        } else if (opcao == 3) {
            System.out.println("Saldo da conta: " + saldoBancario);

        } else if (opcao == 4) {
            if (this instanceof ContaCorrente) {
                ((ContaCorrente) this).cobrarTarifa();
            } else {
                System.out.println("Apenas contas correntes cobram tarifa!");
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.menu();
    }
}


