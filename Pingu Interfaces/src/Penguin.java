public class Penguin implements Copyable, Comparable  {
    private  String name;
    private double height;

    public Penguin(String name, double height){
        this.name = name;
        this.height = height;
    }

    @Override
    public Penguin copy() {
        return new Penguin(this.name, this.height);
    }


    @Override

    public int compareTo(Penguin another) {
        if(this.name.equals(another.getName()) && this.height == another.getHeight()){
            return 0;
        }
        if(this.height > another.getHeight()){
            return -1;
        }else if(this.height < another.getHeight()){
            return 1;
        }
        boolean nameBoolean = false;
        int shortestLength;

        if(this.name.length() < another.getName().length()){
            shortestLength = this.name.length();
        }else{
            shortestLength = another.getName().length();
        }

        for (int i = 0; i <shortestLength;i++) {
            if ((int) this.name.charAt(i) >(int) another.getName().charAt(i)) {
                nameBoolean= true;
            }else{
                nameBoolean = false;
            }
        }
        if(nameBoolean){
            return 1;
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}
