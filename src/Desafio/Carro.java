package Desafio;

public class Carro {
    private String definirModelo;
    private double preco1;
    private double preco2;
    private double preco3;

    public void setDefinirModelo(String definirModelo) {
        this.definirModelo = definirModelo;
    }

    public void definirPreco (double preco1, double preco2, double preco3) {
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public void exibirInformacoesCarro(){
        System.out.println("O modelo: " + definirModelo);
        System.out.println("Preço Ano 1: " + preco1);
        System.out.println("preço Ano 2: " + preco2);
        System.out.println("preco Ano 3: " + preco3);
        System.out.println("Menor preço: " + calcularMenorPreco());
        System.out.println("Maior preço: " + calcularMaiorPreco());
    }

    public double calcularMenorPreco() {
        double menorPreco = preco1;
        if (preco2 < menorPreco) {
            menorPreco = preco2;
        }
        if (preco3 < menorPreco) {
            menorPreco = preco3;
        }
        return menorPreco;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = preco1;

        if (preco2 > maiorPreco) {
            maiorPreco = preco2;
        }
        if (preco3 > maiorPreco ) {
            maiorPreco = preco3;
        }

        return maiorPreco;
    }
}


