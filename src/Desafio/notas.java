public class notas {
    static void main(String[] args) {
       Aluno aluno1 = new Aluno("Roberto", 8.5,9.0, 4.5);
       Aluno aluno2 = new Aluno("Fravin do pneu", 7.5, 2.9, 4);

        System.out.println("Aluno1 nome: " + aluno1.getNome());
        System.out.println("Aluno1 nota1: " + aluno1.getNota1());
        System.out.println("Aluno1 nota2: " + aluno1.getNota2());
        System.out.println("Aluno1 nota3: " + aluno1.getNota3());
        double media1 = aluno1.calcularMedia();
        System.out.println("Calcular Media: " + media1);
        if (media1 < 6) {
            System.out.println("Status: REPROVOU");
        } else {
            System.out.println("Status: PASSOU");
        }
        System.out.println();

        System.out.println("Aluno nome: " + aluno2.getNome());
        System.out.println("Aluno2 nota1: " + aluno2.getNota1());
        System.out.println("Aluno2 nota2: " + aluno2.getNota2());
        System.out.println("Aluno2 nota3: " + aluno2.getNota3());
       double media2 = aluno2.calcularMedia();
        System.out.println("Calcular Media: " + media2);

        if (media2 < 6 ) {
            System.out.println("REPROVOU");
        } else {
            System.out.println("PASSOU");
        }
    }
}

