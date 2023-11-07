public class Main {
    public static void main(String[] args) {


        Animal lion = new Animal("Lion", 20000);
        Animal tiger = new Animal("Tiger", 20000);
        Animal elephant = new Animal("Elephant", 50000);

        Vivarium vivarium1 = new Vivarium(1990, 20,new Animal[]{lion,tiger,elephant});
        Vivarium vivarium2 = new Vivarium(1990, 20,new Animal[]{lion,tiger,elephant});
        Zoo zoo1 = new Zoo(new Vivarium[]{vivarium1, vivarium2});
        System.out.println(vivarium1.toString());
        System.out.println(zoo1.toString());
        System.out.println(zoo1.getCosts());
    }
}