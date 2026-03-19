import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldoInicial = 2500;

        System.out.println("******************************************");
        System.out.println();
        System.out.println("Nome cliente: Jacqueline Oliveira");
        System.out.println("Tipo conta = Corrente");
        System.out.println("Saldo Inicial = 2500");
        System.out.println();
        System.out.println("******************************************");
        System.out.println("         MENU");
        System.out.println("1 - Consultar Saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");
        System.out.println("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        while(opcao != 4) {
            if (opcao == 1) {
                System.out.println(saldoInicial);
                break;
            } else if (opcao == 2) {
                System.out.println("Digite o valor de deposito a receber: ");
                int deposito = scanner.nextInt();
                deposito += saldoInicial;
                System.out.println("Saldo atualizado: $" + deposito);
                break;
            } else if (opcao == 3) {
                System.out.println("Digite o valor de transferir:");
                int transferir = scanner.nextInt();

                if (transferir > saldoInicial) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldoInicial -= transferir;
                    System.out.println("Saldo atualizado: $" + saldoInicial);
                }
                break;
            }
            else {
                System.out.println("Opção inválida!");
                break;
            }
        }
    }

}
