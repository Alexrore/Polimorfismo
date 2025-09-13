public abstract class Shape implements Comparable<Shape> {

    public abstract double area();

    public int compareTo(Shape other) {
        return Double.compare(this.area(), other.area());
    }

    public String toString() {
        return this.getClass().getSimpleName() + " (área=" + area() + ")";
    }
}
