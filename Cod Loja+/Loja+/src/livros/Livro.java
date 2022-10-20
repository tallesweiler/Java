package livros;

public class Livro {
    private String titulo;
    private String nomeDoAutor;
    private int anoDePublicaçao;

    public Livro(String titulo, String nomeDoAutor, int anoDePublicaçao) {
        this.titulo = titulo;
        this.nomeDoAutor = nomeDoAutor;
        this.anoDePublicaçao = anoDePublicaçao;
    }
    public Livro() {}

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getNomeDoAutor() {
        return nomeDoAutor;
    }
    public void setNomeDoAutor(String nomeDoAutor) {
        this.nomeDoAutor = nomeDoAutor;
    }
    public int getAnoDePublicaçao() {
        return anoDePublicaçao;
    }
    public void setAnoDePublicaçao(int anoDePublicaçao) {
        this.anoDePublicaçao = anoDePublicaçao;
    }

    public String toString() {
        return (titulo + " (" + nomeDoAutor + ") " + anoDePublicaçao);
    }
}
