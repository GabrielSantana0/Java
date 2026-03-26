package Desafio;

public class testeCarro {
    static void main(String[] args) {
        Carro carro = new Carro();

        carro.setDefinirModelo("Civic");
        carro.definirPreco(23000, 10000, 70000);
        carro.exibirInformacoesCarro();

    }
    
}
