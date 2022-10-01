public class App {
    public static void main(String[] args) {
        Cliente talles = new ClienteEspecial("talles", 1234);

        talles.deposito(1000);

        talles.consultaSaldo();
    }
}
