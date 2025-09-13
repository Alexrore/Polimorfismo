public class TriangleEQ extends Shape {

    //Atributos
    protected double b;
    protected double h;

    //Constructor
    public TriangleEQ(double b, double h) {
        this.b = b;
        this.h = h;
    }

    //Metodos
    public double area() {
        return b*h/2;
    }
}
