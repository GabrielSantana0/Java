package Screenmatch;
import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(2);
        meuFilme.avalia(5);

        System.out.println("O total de avaliações é: " + meuFilme.getTotalDeAvaliacoes());

       // meuFilme.somaDasAvaliacoes = 10;
       // meuFilme.totalDeAvaliacoes = 1;
        System.out.println("A media é: " + meuFilme.obterMedia());
    }
}