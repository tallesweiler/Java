public class App {
    public static void main(String[] args) {
        Cliente talles = new ClienteEspecial("talles");

        talles.deposito(1000);

        talles.consultaSaldo();
        talles.saque(990);
        talles.consultaSaldo();
    }
}
