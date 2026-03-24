package Desafio;

public class Desafio3 {
    static void main(String[] args) {

        int pares = 0;
        int impares = 0;
        for(int i = 1; i <= 10; i++) {
        if (i % 2 == 0) {
            System.out.println("Par");
            pares++;
        } else {
            System.out.println("Impar");
            impares++;
        }
        }
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);

    }
}
