public abstract class Shape implements Comparable<Shape> {

    public abstract double area();

    public int compareTo(Shape other) //Sirve para que el sort lo pueda saber como ordenarlo
    {
        return Double.compare(this.area(), other.area());
    }

    public String toString() {
        return this.getClass().getSimpleName() + " (área=" + area() + ")";
    }

    //Implementar Comparable<Shape>
}
