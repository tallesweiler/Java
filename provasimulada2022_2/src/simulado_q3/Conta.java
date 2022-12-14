package simulado_q3;

public class Conta {
    private String nomeCliente;
    private double saldoInicial;
    
    public Conta(String nomeCliente, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.saldoInicial = saldoInicial;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public double getSaldoInicial() {
        return saldoInicial;
    }
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
}
