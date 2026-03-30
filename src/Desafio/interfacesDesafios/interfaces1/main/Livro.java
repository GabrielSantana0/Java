package Desafio.interfacesDesafios.interfaces1.main;

public class Livro extends ProdutoFisicos implements Calculavel {
    private String livroNome;
    private double livroPreco;
    private double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getLivroPreco() {
        return livroPreco;
    }

    public void setLivroPreco(double livroPreco) {
        this.livroPreco = livroPreco;
    }

    public String getLivroNome() {
        return livroNome;
    }

    public void setLivroNome(String livroNome) {
        this.livroNome = livroNome;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Livro: " + livroNome);
        System.out.println("Preco do Livro: " + livroPreco);
        System.out.println("Preco final: " + calcularPrecoFinal());
    }



    @Override
    public double calcularPrecoFinal() {
        return livroPreco - (livroPreco * (desconto / 100));
    }
}
