public class Square  extends  BaseArea{
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double circumference() {
        return 4 * length;
    }

    @Override
    double area() {
        return  length * length;
    }

    @Override
    boolean isSquare() {
        return true;
    }

    @Override
    Square toSquare() {
        return this;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
