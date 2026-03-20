public class Livro {
    private String tituloLivro;
    private String autor;

    public void setLivro(String livro) {
        this.tituloLivro = livro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLivro() {
        return tituloLivro;
    }

    public String getAutor() {
        return autor;
    }

    void  exibirInformacoes(){
        System.out.println("Livro: " + tituloLivro);
        System.out.println("Autor: " + autor);
    }
}
