import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public GestorFiguras() {

    }
    public static double sum(Shape[] v) //Sirve para sumar las areas
    {
        double total = 0;
        for (Shape s : v) //Recorre el vector
        {
            total += s.area();
        }
        return total;
    }
    public static void sort(Shape[] v) //Usa el comprareTo para ordenarlos
    {
        Arrays.sort(v);
    }

    public static void print(Shape[] v) {
        for (Shape s : v)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Shape[] v = new Shape[4];


        v[0] = new Rectangle(5, 3);
        v[1] = new Circle(5);
        v[2] = new Square(5);
        v[3] = new Circle(120);
        v[4] = new TriangleEQ(4, 2);

        double res = GestorFiguras.sum(v);

        System.out.println("sum: " + res+"\n");

        GestorFiguras.print(v);
        System.out.println("\n");

        GestorFiguras.sort(v);
        System.out.println("Ahora ordenado\n");

        GestorFiguras.print(v);
    }

}