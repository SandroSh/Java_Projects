public class Prism {
    private double height;
    BaseArea base;

    public Prism(double height, BaseArea base) {
        this.height = height;
        this.base = base;
    }

    public double surface(){
        if( base instanceof Rectangle){
            return base.area() * 2 + ((Rectangle) base).getHeigth() * height * 2 + ((Rectangle) base).getWidth() * 2;

        }else if( base instanceof Square){
            return base.area() * 2 + ((Square) base).getLength() * height * 4;
        }else if( base instanceof  RegularPolygon){
            return base.area() * 2 + ((RegularPolygon) base).getLength() * height * ((RegularPolygon) base).getN();
        }else if(base instanceof Circle){
            return base.area() * 2 + base.circumference() * height;
        }

        return 0;
    }

    public boolean isCube(){
        if(base instanceof Square && height == ((Square) base).getLength()){
            return true;
        }else if(base instanceof Rectangle && base.isSquare() && ((Rectangle) base).getWidth() == height){
            return true;
        }else if( base instanceof RegularPolygon && base.isSquare() && ((RegularPolygon) base).getLength() == height){
            return  true;
        }
        return  false;
    }
    public double volume(){
        return base.area() * height;
    }

    @Override
    public String toString() {
        return "Prism{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
