package Desafio.ArraysDesafios.desafio2;

import java.util.Scanner;

public class desafio {

    static int pares(int[] v) {
        int contador = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] %2 == 0) {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite Os Numeros: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Quantidade de pares: " + pares(numeros));
    }
}