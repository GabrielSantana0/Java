package Desafio.ArraysDesafios;
import java.util.Scanner;

public class exibirPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numero = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i ++ ) {
            System.out.println("Digite 10 numeros: ");
            numero[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i ++ ) {
            if (numero[i] % 2 == 0 ) {
                soma += numero[i];

            }
        }
        System.out.println("Soma pares: " + soma);
        sc.close();
    }
}
