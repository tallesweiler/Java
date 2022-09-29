public class Triangulo extends FormaGeometrica {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double getPerimetro() {
        return lado1+lado2+lado3;
    }
    public double getArea() {
        double semip=getPerimetro()/2;
        return Math.sqrt(semip*(semip-lado1)*(semip-lado2)*(semip-lado3));
    }
    public String toString() {
        return "\nTriangulo: \n" + super.toString();
    }
}
