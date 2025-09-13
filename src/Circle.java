public class Circle extends Shape {
    //Atributos
    protected double radius;

    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Metodos
    public double area() {
        return Math.PI * radius * radius;
    }

}