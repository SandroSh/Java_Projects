public class Animal {
    private String name;
    private  int foodCosts;

    public Animal(String name, int foodCosts){

        this.foodCosts = foodCosts;
        this.name = name;

    }
    public int getFoodCosts() {
        return foodCosts;
    }
    public String getName() {
        return name;
    }
    public void setFoodCosts(int foodCosts) {
        this.foodCosts = foodCosts;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "(name: " + this.name + ", foodCosts: " + this.foodCosts +")";
    }
}
