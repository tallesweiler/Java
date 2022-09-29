public abstract class FormaGeometrica {
    public abstract double getArea();
    public abstract double getPerimetro();

    public String toString() {
        return "Perimetro: " + getPerimetro() + "\n" + "Área: " + getArea();
    }
}
