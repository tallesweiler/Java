public class FuncionarioTempoIntegral extends Funcionario {
    private int numeroHorasSemanais=20;

    public FuncionarioTempoIntegral(String nome, float salario, int id, int numeroHorasSemanais) {
        super(nome, salario, id);
        this.numeroHorasSemanais=numeroHorasSemanais;
    }
    public FuncionarioTempoIntegral(String nome, float salario, int id) {
        super(nome, salario, id);
    }

    public int getNumeroHorasSemanais() {
        return numeroHorasSemanais;
    }
    public void setNumeroHorasSemanais(int numeroHorasSemanais) {
        this.numeroHorasSemanais = numeroHorasSemanais;
    }

    @Override
    public String toString() {
        return super.toString() + " Número de horas semanais: " +getNumeroHorasSemanais();
    }
}
