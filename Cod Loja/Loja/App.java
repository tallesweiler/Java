public class App {
    public static void main(String[] args) {
        Loja rihappy = new Loja("Ri Happy");

        Produto harry   = new Livro("Harry Potter e o Prisioneiro de Azkaban", 27.89, "J.K. Rowling");
        Produto caixa   = new Livro("Caixa de Passaros", 17.95, "Josh Malerman");
        Produto banco   = new Jogo("Banco Imobiliario", 100, 8);
        Produto vida    = new Jogo("Jogo da Vida", 99.95, 9);
        Produto uno     = new Jogo("Uno", 15, 5);
        
        rihappy.insereProduto(harry);
        rihappy.insereProduto(caixa);
        rihappy.insereProduto(banco);
        rihappy.insereProduto(vida);
        rihappy.insereProduto(uno);

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
