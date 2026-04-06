package Desafio.ArraysDesafios.DesafiosArray1;

import java.util.Scanner;

public class Desafio2 {
   public  static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int maior = 0;
       System.out.println("Digite quantidade de Numeros: ");
       int quantidade = sc.nextInt();

       for (int i = 0; i < quantidade; i ++) {
           System.out.println("Digite o " + (i +  1) +" ºnúmero: ");
           int numeros = sc.nextInt();

           if (i == 0 ) {
             maior = numeros;
           } else if (numeros > maior) {
                maior = numeros;
           }
       }
       System.out.println("Maior numero: " + maior);
    }
}
