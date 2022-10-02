public class App {
    public static void consultaClientes(Banco b) {
        System.out.println();
        for (Cliente c : b.getClientes()) {
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Banco nubank = new Banco("NuBank");

        Cliente talles = new ClienteEspecial("talles");
        Cliente joao = new Cliente("joao");

        nubank.insereCliente(talles);
        nubank.insereCliente(joao);
        System.out.println();
        talles.deposito(1000);
        talles.saque(990);

        System.out.println();
        joao.saque(0);
        joao.deposito(100);
        joao.saque(99);
        joao.saque(95);

        consultaClientes(nubank);
    }
}
