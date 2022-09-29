public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio=raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getPerimetro() {
        return 2*Math.PI*raio;
    }
    public double getArea() {
        return Math.PI*raio*raio;
    }
    public String toString() {
        return "\nCirculo: \n" + super.toString();
    }
}
