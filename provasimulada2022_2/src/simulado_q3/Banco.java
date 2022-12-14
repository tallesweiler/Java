package simulado_q3;

import java.util.LinkedList;
import java.util.List;

public class Banco {
    private String nomeBanco;
    private List<Agencia> agencias = new LinkedList<>();

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
    public List<Agencia> getAgencias() {
        return agencias;
    }
    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }

    public Agencia criaAgencia(String nomeAgencia) {
        Agencia a = new Agencia(nomeAgencia);
        agencias.add(a);
        return a;
    }

    public String toString() {
        String s="";

        s+="Nome do Banco: " + nomeBanco + "\n";
        for (Agencia a : agencias) {
            s+="Agência: " + a.getNomeAgencia() + ", saldo médio: " + a.retornaSaldoMedio() + "\n";
        }
        return s;
    }
}
