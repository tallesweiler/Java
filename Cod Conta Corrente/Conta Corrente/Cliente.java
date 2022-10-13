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
    public double getTaxa(){
        return 0.05;
    }

    public void deposito(double valor) {
        saldo+=valor;
        System.out.println("Deposito realizado com sucesso!");
    }
    public void saque(double valor) {
        if((valor+valor*getTaxa())<getSaldo()) {
            setSaldo(getSaldo()-(valor+valor*getTaxa()));
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public String toString() {
        return String.format("Cliente: %s\nSaldo: R$%.2f\n", getNome(), getSaldo());
    }
}
