public class TriangleEQ extends Shape{

    //Atributos
    public class TriangleEQ extends Shape {

        //Atributos
        public double b;
        public double h;

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
}
