public class App {
    public static void main(String[] args) {
        Cliente talles = new ClienteEspecial("talles");
        Cliente joao = new Cliente("joao");

        talles.deposito(1000);
        talles.consultaSaldo();
        talles.saque(990);
        talles.consultaSaldo();

        joao.consultaSaldo();
        joao.saque(0);
        joao.deposito(100);
        joao.saque(99);
        joao.saque(95);
        joao.consultaSaldo();
    }
}
