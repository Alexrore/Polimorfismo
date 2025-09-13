import java.util.Arrays;

public class GestorFiguras {

    public GestorFiguras() {

    }
    public static double sum(Shape[] v) {
        double total = 0;
        for (Shape s : v) {
            total += s.area();
        }
        return total;
    }
    public static void sort(Shape[] v) {
        Arrays.sort(v);
    }

    public static void print(Shape[] v) {
        for (Shape s : v) {
            System.out.println(s);
        }
    }

}

