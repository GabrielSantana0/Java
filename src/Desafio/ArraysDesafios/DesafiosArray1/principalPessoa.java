package Desafio.ArraysDesafios.DesafiosArray1;
import java.util.ArrayList;

public class principalPessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(new Pessoa("Gabriel", 22));
        listaDePessoas.add(new Pessoa("Nicolas", 18));
        listaDePessoas.add(new Pessoa("Pietro", 33));



        System.out.println("Tamanho Lista: " + listaDePessoas.size());
        System.out.println("Primeira Pessoa: " + listaDePessoas.get(0));
        System.out.println("Lista toda: " + listaDePessoas.toString());
    }
}
