package simulado_q3;

import java.util.LinkedList;
import java.util.List;

public class Agencia {
    private String nomeAgencia;
    private List<Conta> contas = new LinkedList<>();

    public Agencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }
    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionaConta(Conta conta) {
        contas.add(conta);
    }

    public double retornaSaldoMedio() {
        double saldoTotal=0;
        for (Conta c : contas) {
            saldoTotal+=c.getSaldoInicial();
        }
        return saldoTotal/contas.size();
    }
}
