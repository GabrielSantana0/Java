public class notas {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lulu", 7.5, 8.5, 9.2);
        Aluno aluno2 = new Aluno("Amanda", 3.4, 7.0, 8.5);

        System.out.println("Aluno 1: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Media: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Media: " + aluno2.calcularMedia());

    }
}
