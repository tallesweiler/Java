public class Triangulo {
    private PontoCartesiano p1, p2, p3;

    public Triangulo(PontoCartesiano p1, PontoCartesiano p2, PontoCartesiano p3) {
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }

    public PontoCartesiano getP1() {
        return p1;
    }
    public void setP1(PontoCartesiano p1) {
        this.p1 = p1;
    }
    public PontoCartesiano getP2() {
        return p2;
    }
    public void setP2(PontoCartesiano p2) {
        this.p2 = p2;
    }
    public PontoCartesiano getP3() {
        return p3;
    }
    public void setP3(PontoCartesiano p3) {
        this.p3 = p3;
    }

    public double perimetro() {
        return tamanhoLado(p1, p2)+tamanhoLado(p1, p3)+tamanhoLado(p2, p3);
    }
    public double tamanhoLado(PontoCartesiano p1, PontoCartesiano p2) {
        double x=p2.getX()-p1.getX();
        double y=p2.getY()-p1.getY();
        
        return Math.sqrt(x*x+y*y);
    }
}
