import java.util.LinkedList;

public class Departamento {
    private String nome;
    private LinkedList<Funcionario> funcionarios;

    public Departamento (String nome) {
        this.nome = nome;
        this.funcionarios = new LinkedList<Funcionario>();
    }
    public Departamento() {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LinkedList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(LinkedList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void insereFuncionario(Funcionario funcionario) {
        this.funcionarios.addLast(funcionario);
    }
    public void removeFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public void aumentaSalarioFuncionarios (float porcentagem) {
        for (Funcionario f : funcionarios) {
            f.aumentaSalario(porcentagem);
        }
    }

    public float getSalarioTotalDoDepartamento () {
        float valor=0;
        for (Funcionario f : funcionarios) {
            valor+=f.getSalario();
        }
        return valor;
    }

    public float getSalarioMedioDoDepartamento () {
        float valor=getSalarioTotalDoDepartamento();
        return valor/funcionarios.size();
    }
}