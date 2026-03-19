public class Produto {
    String nome;
    double preco;
    int quantidade;

    void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total: " + calcularValorTotal());
    }

    double calcularValorTotal() {
        return preco * quantidade;
    }

    void aplicarDesconto(double percentual) {
          preco = preco * (1 - percentual / 100);
    }
}