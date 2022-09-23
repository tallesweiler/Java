import java.util.LinkedList;

public class Departamento {
    private String nome;
    private LinkedList<Funcionários> funcionários;

    public Departamento (String nome) {
        this.nome = nome;
        this.funcionários = new LinkedList<Funcionários>();
    }
    public Departamento() {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LinkedList<Funcionários> getFuncionários() {
        return funcionários;
    }
    public void setFuncionários(LinkedList<Funcionários> funcionários) {
        this.funcionários = funcionários;
    }

    public void insereFuncionario(Funcionários funcionário) {
        this.funcionários.addLast(funcionário);
    }
    public void removeFuncionário(Funcionários funcionário) {
        this.funcionários.remove(funcionário);
    }

    public void aumentaSalárioFuncionários (float porcentagem) {
        for (Funcionários f : funcionários) {
            f.setSalário(f.getSalário()+f.getSalário()/100.0f);;
        }
    }
}

