public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento  =1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(2);
        meuFilme.avalia(5);

        System.out.println("A soma das Avaliaçoes é: " + meuFilme.somaDasAvaliacoes);
        System.out.println("O total de avaliações é: " + meuFilme.totalDeAvaliacoes);
        System.out.println("A media é: " + meuFilme.obterMedia());
    }
}