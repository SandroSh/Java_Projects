public class Circle extends BaseArea {
    private  double radius;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double circumference() {
        return radius * 2 * Math.PI;
    }

    @Override
    double area() {
        return  radius * radius * Math.PI;
    }

    @Override
    boolean isSquare() {
        return false;
    }

    @Override
    Square toSquare() {
        return null;
    }
}
