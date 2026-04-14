package Desafio.ArraysDesafios.DesafiosArray1;

import java.util.Scanner;

public class Desafio4 {
   public  static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int impares = 0;
       int par = 0;

       System.out.println("Quantidades de Numeros: ");
       int quantidade = sc.nextInt();

       for (int i = 0; i < quantidade; i++) {
           System.out.println("Digite Os Numeros: ");
           int numeros = sc.nextInt();

           if (numeros % 2 == 0) {
               par ++;
           }
           else {
               impares ++;
           }
       }
       System.out.println("Quantidade par: " + par);
       System.out.println("Quantidade Impar " + impares);
    }
}
