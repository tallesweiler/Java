public class App {
    public static void main(String[] args) {
        PontoCartesiano p1=new PontoCartesiano(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        PontoCartesiano p2=new PontoCartesiano(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
        PontoCartesiano p3=new PontoCartesiano(Double.parseDouble(args[4]), Double.parseDouble(args[5]));

        Triangulo t = new Triangulo(p1, p2, p3);

        System.out.println(t.perimetro());
    }
}