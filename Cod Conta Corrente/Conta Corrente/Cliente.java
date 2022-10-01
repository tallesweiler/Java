public class Cliente {
    private String nome;
    private double saldo;
    private int senha;

    public Cliente(String nome, int senha) {
        this.nome=nome;
        this.senha=senha;
    }
    public Cliente() {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void consultaSaldo() {
        System.out.println("Cliente: " + getNome() + "\nSaldo atual: R$" + getSaldo());
    }
    public void deposito(double valor) {
        saldo+=valor;
    }

    //@Override
    public void saque(double valor) {
        if((valor+valor*0.05)<saldo) {
            saldo-=(valor+valor*0.05);
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
