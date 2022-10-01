public class ClienteEspecial extends Cliente {
    public ClienteEspecial(String nome) {
        super(nome);
    }

    @Override
    public void saque(double valor) {
        if((valor+valor*0.01)<getSaldo()) {
            setSaldo(getSaldo()-(valor+valor*0.01));
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
