package Desafio.interfacesDesafios;

public class ProdutoFisicos implements Calculavel{
    private String nome;
    private double preco;
    private double frete;
    private double imposto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco base: " +  preco);
        System.out.println("Frete: " + frete);
        System.out.println("imposto: " + imposto);
        System.out.println("Preco final: " + calcularPrecoFinal());
    }



    @Override
    public double calcularPrecoFinal() {
        return preco + frete + imposto;
    }
}
