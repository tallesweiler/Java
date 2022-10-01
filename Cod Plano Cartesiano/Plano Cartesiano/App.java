public class App {
    public static void main(String[] args) {
        PontoCartesiano p1, p2, p3;
        String aux1, aux2;

        aux1=args[0];
        aux2=args[1];
        p1=new PontoCartesiano(Double.parseDouble(aux1), Double.parseDouble(aux2));

        aux1=args[2];
        aux2=args[3];
        p2=new PontoCartesiano(Double.parseDouble(aux1), Double.parseDouble(aux2));

        aux1=args[4];
        aux2=args[5];
        p3=new PontoCartesiano(Double.parseDouble(aux1), Double.parseDouble(aux2));

        Triangulo t = new Triangulo(p1, p2, p3);

        System.out.println(t.perimetro());
    }
}