public class Main{
    public static void main(String[] args) {
        System.out.println("Esse é o screen Match");
        System.out.println("br.com.alura.screenmatch.modelos.Filme: Top Gun: Maverick");

        int yearOfRelease = 2022;
        System.out.println("Year Of Release: " + yearOfRelease);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.8) /3;
        System.out.println(media);

        String sinopse;
        sinopse = "após mais de 30 anos de serviço, Pete Mitchell (Tom Cruise) continua na ativa como um corajoso piloto de testes, evitando promoções para não deixar de voar. Ele é chamado para treinar uma nova equipe de graduados Top Gun para uma missão suicida e especial, confrontando os fantasmas de seu passado ao treinar Bradley Bradshaw (Rooster), filho de seu falecido amigo Goose";
        System.out.println("Sinopse:" + sinopse);

        int classificacao = (int)  (media /2);
        System.out.println("classificação:" + classificacao);
    }
}