import java.util.LinkedList;

public class Departamento {
    private String nome;
    private LinkedList<Funcionarios> funcionarios;

    public Departamento (String nome) {
        this.nome = nome;
        this.funcionarios = new LinkedList<Funcionarios>();
    }
    public Departamento() {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LinkedList<Funcionarios> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(LinkedList<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void insereFuncionario(Funcionarios funcionario) {
        this.funcionarios.addLast(funcionario);
    }
    public void removeFuncionario(Funcionarios funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public void aumentaSalarioFuncionarios (float porcentagem) {
        for (Funcionarios f : funcionarios) {
            f.aumentaSalario(porcentagem);
        }
    }

    public float getSalarioTotalDoDepartamento () {
        float valor=0;
        for (Funcionarios f : funcionarios) {
            valor+=f.getSalario();
        }
        return valor;
    }

    public float getSalarioMedioDoDepartamento () {
        float valor=getSalarioTotalDoDepartamento();
        return valor/funcionarios.size();
    }
}