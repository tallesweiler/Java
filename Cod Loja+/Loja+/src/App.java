import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import livros.Livro;

public class App {
    public static void menu() {
        System.out.print("\033\143"); //clean
        System.out.println("==============================");
        System.out.println("|  1 - Cadastrar livro!      |");
        System.out.println("|  2 - Listar livros!        |");
        System.out.println("|  3 - Consultar livro!      |");
        System.out.println("|  4 - Remover livro!        |");
        System.out.println("|  0 - Sair!                 |");
        System.out.println("==============================");
        System.out.print("Selecione uma opcao: ");
    }

    public static void cadastraLivro(Scanner scan, Map<String, Livro> livros) {
        Livro l = new Livro();

        System.out.print("Nome do livro: ");
        l.setTitulo(scan.nextLine());

        System.out.print("Nome do autor: ");
        l.setNomeDoAutor(scan.nextLine());

        System.out.print("Ano de publicaçao: ");
        l.setAnoDePublicaçao(scan.nextInt());
        System.out.println();

        System.out.println("Livro cadastrado com sucesso!");

        livros.put(l.getTitulo(), l);
    }

    public static void listaLivros(Map<String, Livro> livros) {
        for (Livro l : livros.values()) {
            System.out.println(l);
        }
    }

    public static void consultaLivro(Scanner scan, Map<String, Livro> livros) {
        System.out.println("Livros disponiveis: " + livros.keySet());

        System.out.print("Selecione um livro para consultar: ");
        String chave=scan.nextLine();
        
        System.out.println("\n" + livros.get(chave));
    }

    public static void removeLivro(Scanner scan, Map<String, Livro> livros) {
        System.out.println("Livros disponiveis: " + livros.keySet());

        System.out.print("Selecione um livro para remover: ");
        String chave=scan.nextLine();
        
        System.out.println("\n" + livros.get(chave));

        System.out.print("\nTem certeza que deseja remover esse livro? (Digite '1' para remover): ");
        int resp=scan.nextInt();
        scan.nextLine();
        if (resp==1) {
            livros.remove(chave);
            System.out.println("O livro foi removido!");
        }
        else {
            System.out.println("O livro nao foi removido!");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Map<String, Livro> livros = new HashMap<String, Livro>();

        while(true) {
            menu();

            int x=scan.nextInt();
            scan.nextLine();
            System.out.print("\033\143");

            if (x==1) {
                cadastraLivro(scan, livros);
            }
            else if (x==2) {
                listaLivros(livros);
            }
            else if (x==3) {
                consultaLivro(scan, livros);
            }
            else if (x==4) {
                removeLivro(scan, livros);
            }
            else if (x==0) {
                System.out.print("\033\143");
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
