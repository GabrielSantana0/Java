package Desafio.interfacesDesafios.interfaces1.main;

public class PrincipalLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setLivroNome("Batman");
        livro.setLivroPreco(250.00);
        livro.setDesconto(10);
        livro.exibirInformacoes();


        ProdutoFisicos p = new ProdutoFisicos();

        System.out.println();
        p.setNome("Marvel");
        p.setPreco(150);
        p.setFrete(15);
        p.setImposto(5);


        p.exibirInformacoes();
    }
}
