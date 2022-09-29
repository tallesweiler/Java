import java.util.*;

public class App {
    public static void main(String[] args) {
        Circulo c = new Circulo(1.0);
        Retangulo r = new Retangulo(2.0,3.0);
        Triangulo t = new Triangulo(1.5,1.5,2);

        List<FormaGeometrica> formas = new LinkedList<>();

        formas.add(c);
        formas.add(r);
        formas.add(t);

        for (FormaGeometrica f : formas) {
            System.out.println(f);
        }
    }
}
