import java.util.LinkedList;

public class Loja {
    private String nome;
    private LinkedList<Produto> produtos;

    public Loja(String nome) {
        this.nome=nome;
        this.produtos=new LinkedList<Produto>();
    }
    public Loja() {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LinkedList<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(LinkedList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void insereProduto(Produto p) {
        this.produtos.add(p);
    }
    public void removeProduto(Produto p) {
        this.produtos.remove(p);
    }
}
