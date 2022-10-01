public class Cliente {
    private String nome;
    private double saldo;

    public Cliente(String nome) {
        this.nome=nome;
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

    public void deposito(double valor) {
        saldo+=valor;
    }
    public void saque(double valor) {
        if((valor+valor*0.05)<getSaldo()) {
            saldo-=(valor+valor*0.05);
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public void consultaSaldo() {
        System.out.printf("\nCliente: %s\nSaldo atual: R$%.2f\n", getNome(), getSaldo());
    }
}
