package Desafio;

public class Funcionario {
    private String nomeFuncionario;
    private double salario1;
    private double salario2;
    private double salario3;

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void  salarios(double salario1, double salario2, double salario3) {
        this.salario1 = salario1;
        this.salario2 = salario2;
        this.salario3 = salario3;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Funcionario: " + nomeFuncionario);
        System.out.println("Salario 1 ano: " + salario1);
        System.out.println("Salario 2 ano: " + salario2);
        System.out.println("Salario 3 ano: " + salario3);
        System.out.println("Menor Salario: "  + menorSalario());
        System.out.println("Maior Salario: " + maiorSalario());
        System.out.println("Medio Salario: " + medioSalario());
    }
    
    public double menorSalario() {
        double menor = salario1;
        if (salario2 < menor) {
            menor = salario2;
        } if (salario3 < menor) {
            menor = salario3;
        }
        return menor;
    }


    public double maiorSalario() {
        double maior = salario1;
        if (salario2 > maior) {
            maior = salario2;
        } if ( salario3 > maior) {
            maior = salario3;
        }
        return maior;
    }

    public double medioSalario() {
        return (salario1 + salario2 + salario3) / 3.0;
    }
}


