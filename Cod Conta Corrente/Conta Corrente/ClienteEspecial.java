public class ClienteEspecial extends Cliente {
    public ClienteEspecial(String nome, int senha) {
        super(nome, senha);
    }

    @Override
    public void saque(double valor) {
        if((valor+valor*0.01)<super.saldo) {
            super.saldo-=(valor+valor*0.05);
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
