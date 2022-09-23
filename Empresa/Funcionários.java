public class Funcionários {
    private String nome;
    private float salário;
    private int id;

    public Funcionários(String nome, float salário, int id) {
        this.nome=nome;
        this.salário=salário;
        this.id=id;
    }
    public Funcionários() {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalário() {
        return salário;
    }
    public void setSalário(float salário) {
        this.salário = salário;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
