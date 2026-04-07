package Desafio.ArraysDesafios.DesafiosArray1;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de numero: ");
        int quantidade = sc.nextInt();

        double soma = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite Numeros: ");
            int numero = sc.nextInt();
            soma += numero;
        }

        double media = soma / quantidade;
        System.out.println("Media: " + media);
    }
}
