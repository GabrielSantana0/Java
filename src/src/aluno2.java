public class aluno2 {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome ="controle de PS5";
        produto.preco =  350.00;
        produto.quantidade = 2;
        produto.aplicarDesconto(10);

        System.out.println("Preco com desconto: " + produto.preco);

        produto.exibirInfo();

    }
}