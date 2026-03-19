import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1 - Calcular área do quadrado");
        System.out.println("2 - Calcular área do circulo");
        System.out.println("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            System.out.println("Digite o valor do quadrado: ");
            double quadrado = scanner.nextDouble();

            double area = quadrado * quadrado;
            System.out.println("Á area do quadrado: " + area);
        }else if (opcao == 2) {
        System.out.println("Digite o valor do circulo: ");
        double circulo = scanner.nextDouble();

        double area = Math.PI * circulo * circulo;
            System.out.println("Á area do circulo: " + area);
        } else {
            System.out.println("Opção invalida");
        }
        scanner.close();
    }
}
