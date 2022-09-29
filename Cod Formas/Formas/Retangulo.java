public class Retangulo extends FormaGeometrica {
    private double base, altura;

    public Retangulo(double base, double altura) {
        this.base=base;
        this.altura=altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getPerimetro() {
        return (2*base)+(2*altura);
    }
    public double getArea() {
        return base*altura;
    }
    public String toString() {
        return "\nRetangulo: \n" + super.toString();
    }
}
