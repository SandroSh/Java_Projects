public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Penguin penguin1 = new Penguin("bob",120);
        Penguin penguin2 = new Penguin("boba",120);
        System.out.println(penguin1.compareTo(penguin2));
    }
}