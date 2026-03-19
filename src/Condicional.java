public class Condicional {
    public static void main(String[] args) {
        int yearOfRelease = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (yearOfRelease >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("br.com.alura.screenmatch.modelos.Filme retro que vale a pena assistir");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("Plus")) {
            System.out.println("br.com.alura.screenmatch.modelos.Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
