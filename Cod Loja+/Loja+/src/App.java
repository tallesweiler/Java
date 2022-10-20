import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import livros.Livro;

public class App {
    public static Livro cadastraLivro(Scanner scan) {
        System.out.print("\033\143"); //clean
        Livro l = new Livro();

        System.out.println("Nome do livro: ");
        l.setTitulo(scan.nextLine());
        System.out.println();

        System.out.println("Nome do autor: ");
        l.setNomeDoAutor(scan.nextLine());
        System.out.println();

        System.out.println("Ano de publicaçao: ");
        l.setAnoDePublicaçao(scan.nextInt());
        System.out.println();

        System.out.println("Livro cadastrado com sucesso!");

        return l;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Livro> livros = new HashMap<>();
        int qtdLivros=0;

        while(true) {
            System.out.print("\033\143"); //clean
            System.out.println("==============================");
            System.out.println("|  1 - Cadastrar livro!      |");
            System.out.println("|  2 - Listar livros!        |");
            System.out.println("|  3 - Consultar livro!      |");
            System.out.println("|  4 - Remover livro!        |");
            System.out.println("==============================");

            int x=scan.nextInt();
            scan.nextLine();

            if (x==1) {
                Livro livro=cadastraLivro(scan);
                livros.put(qtdLivros, livro);
                qtdLivros++;
            }
            else if (x==2) {
                for (Livro l : livros.values()) {
                    System.out.println(l);
                }
            }
            else if (x==3) {

            }
            else if (x==4) {

            }
            else if (x==0) {
                System.out.println("Adeus!");
                break;
            }
            else {
                System.out.println("Opçao inválida!");
                
            }

            System.out.print("\nPressione 'Enter' para sair...");
            System.in.read();
        }
    }
}
