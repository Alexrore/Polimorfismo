public class Rectangle extends Shape {
    //Atributos
    protected double L1;
    protected double L2;

    //Constructor
    public Rectangle(double L1, double L2){
        this.L1 = L1;
        this.L2 = L2;
    } //Hacer esto

    //Metodos
    public double area() {
        return L1*L2;
    } //Hacer esto
}
