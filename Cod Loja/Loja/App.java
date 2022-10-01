public class App {
    public static void main(String[] args) {
        Loja rihappy = new Loja("Ri Happy");

        Produto banco = new Jogo("Banco Imobiliario", 100, 8);
        Produto harry = new Livro("Harry Potter e o Prisioneiro de Azkaban", 27.89, "J.K. Rowling");
        Produto uno = new Jogo("Uno", 15, 5);
        Produto caixa = new Livro("Caixa de Passaros", 17.95, "Josh Malerman");
        Produto vida = new Jogo("Jogo da Vida", 99.95, 9);

        rihappy.insereProduto(banco);
        rihappy.insereProduto(harry);
        rihappy.insereProduto(uno);
        rihappy.insereProduto(caixa);
        rihappy.insereProduto(vida);

        for (Produto p : rihappy.getProdutos()) {
            System.out.println(p);
        }

        rihappy.removeProduto(banco);
        rihappy.removeProduto(vida);
        rihappy.removeProduto(uno);

        System.out.println("===============================================");

        for (Produto p : rihappy.getProdutos()) {
            System.out.println(p);
        }
    }
}
