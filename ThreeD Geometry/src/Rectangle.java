public class Rectangle extends  BaseArea{
    private double width;
    private double heigth;
    @Override
    double circumference() {
        return  2 * width + 2 * heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    double area() {
        return width * heigth;
    }

    @Override
    boolean isSquare() {
        if(width == heigth){
            return true;
        }else{
            return false;
        }

    }

    @Override
    Square toSquare() {
        if( isSquare()){
            return new Square(width);
        }
        return null;
    }
}
