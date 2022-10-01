import java.util.LinkedList;

public class Banco {
    private String nome;
    private LinkedList<Cliente> clientes;

    public Banco(String nome) {
        this.nome=nome;
        this.clientes=new LinkedList<Cliente>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LinkedList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void insereCliente(Cliente c) {
        this.clientes.add(c);
    }
    public void removeCliente(Cliente c) {
        this.clientes.remove(c);
    }
}
