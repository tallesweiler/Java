public class ClienteEspecial extends Cliente {
    public ClienteEspecial(String nome) {
        super(nome);
    }

    @Override
    public double getTaxa(){
        return 0.01;
    }
}
