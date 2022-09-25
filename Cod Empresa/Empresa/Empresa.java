import java.util.LinkedList;

public class Empresa {
    private String nome;
    private LinkedList<Departamento> departamentos;

    public Empresa (String nome) {
        this.nome = nome;
        this.departamentos=new LinkedList<Departamento>();
    }
    public Empresa () {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LinkedList<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(LinkedList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void insereDepartamento(Departamento departamento) {
        this.departamentos.addLast(departamento);
    }
    public void removeDepartamento(Departamento departamento) {
        this.departamentos.remove(departamento);
    }

    public void aumentaSalárioFuncionários (float porcentagem) {
        for (Departamento d : departamentos) {
            d.aumentaSalarioFuncionarios(porcentagem);
        }
    }

    public float getSalarioTotalDaEmpresa () {
        float valor=0;
        for (Departamento d : departamentos) {
            valor+=d.getSalarioTotalDoDepartamento();
        }
        return valor;
    }

    public float getMediaSalarialDaEmpresa () {
        int i=0;
        float valor=0;
        for (Departamento d : departamentos) {
            for (Funcionarios f : d.getFuncionarios()) {
                valor+=f.getSalario();
                i++;
            }
        }
        return valor/i;
    }
}