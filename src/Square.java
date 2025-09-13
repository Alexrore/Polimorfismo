public class Square extends Shape {
    //Atributos
    protected double l;

    //Constructor
    public Square(double l) {
        this.l = l;
    }

    //Metodos
    public double area() {
        return l*l;
    }
}
