public class Time {
    private String nome;
    private Cidade cidade;

    public Time(String nome, Cidade cidade) {
        this.nome=nome;
        this.cidade=cidade;
    }
    public Time() {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
