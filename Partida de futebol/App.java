import java.time.LocalDate;

public class App {
    public static void main(String args[]) {
        Cidade rj=new Cidade("Rio de Janeiro", "RJ");
        Cidade sp=new Cidade("São Paulo", "SP");

        Time fla=new Time("Flamengo", rj);
        Time sao=new Time("São Paulo", sp);

        Estadio maraca=new Estadio("Maracanã", rj);

        Partida p1=new Partida(fla, sao);
        p1.setEstadio(maraca);
        p1.setData(LocalDate.of(2022, 9, 14));
        p1.setGols(1, 0);

        System.out.println();
        System.out.println("Informações da partida:");
        System.out.println("A partida entre " + p1.getTimeCasa().getNome() + " e " + p1.getTimeFora().getNome() + " ocorreu no dia " + p1.getData() + ".");
        System.out.println("O jogo ocorreu no estadio " + p1.getEstadio().getNome() + "(" + p1.getEstadio().getCidade().getEstado() + ").");
        System.out.println("O placar foi de " + p1.getGolsCasa() + "x" + p1.getGolsFora() + " para o " + p1.getTimeCasa().getNome() + ".");
        System.out.println();
    }
}
