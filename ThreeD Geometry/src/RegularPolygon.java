public class RegularPolygon extends  BaseArea{
    private  int n;
    private double length;
    @Override
    double circumference() {
        return  length * n;
    }

    @Override
    double area() {
        return  (n * Math.pow(length,2))/ 4 * Math.tan(Math.PI/n);
    }

    public int getN() {
        return n;
    }

    public double getLength() {
        return length;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    boolean isSquare() {
        if(n == 4){
            return true;
        }
        return false;
    }

    @Override
    Square toSquare() {
        if(isSquare()){
            return  new Square(length);
        }
        return null;
    }

    @Override
    public String toString() {
        return "RegularPolygon{" +
                "n=" + n +
                ", length=" + length +
                '}';
    }
}
