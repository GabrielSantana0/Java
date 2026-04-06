package Desafio.ArraysDesafios.DesafiosArray1;

import java.util.Scanner;

public class Desafio1 {
   public  static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int soma = 0;

       System.out.println("Quantos números deseja digitar? ");
       int leitor = sc.nextInt();

       for (int i = 0; i < leitor; i++) {
           System.out.println("Digite o " + i + " º número:");
            int digitado = sc.nextInt();

            if(digitado % 2 != 0) {
                soma+= digitado;
            }
       }
       System.out.println("a soma dos Impares: " + soma);
    }
}
