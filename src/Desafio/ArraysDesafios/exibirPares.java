package Desafio.ArraysDesafios;
import java.util.Scanner;

public class exibirPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int [] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite 10 numeros: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                soma += numeros[i];
            }
        }
        System.out.println("Soma pares: " + soma);
        sc.close();
    }
}

