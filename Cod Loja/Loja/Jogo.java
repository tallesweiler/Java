public class Jogo extends Produto {
    private int idadeMinima;

    public Jogo(String nome, double preco, int idadeMinima) {
        super(nome, preco);
        this.idadeMinima=idadeMinima;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }
    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    @Override
    public String toString() {
        return super.toString() + "Idade minima recomendada: " + getIdadeMinima() + " anos\n";
    }
}
