package Desafio;

public class CentralFuncionarios {
   public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNomeFuncionario("Rafael paes santos");
        funcionario.setSalarios(1200, 2000, 4000);

        funcionario.exibirInformacoes();
    }
}
