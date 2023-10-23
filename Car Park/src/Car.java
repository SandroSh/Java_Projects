public class Car{

    private String brand;
    private String model;
    private  int year;
    private  LicensePlate licensePlate;
    private int chasisNumber = 0;

    public Car(String brand, int year,  String model, LicensePlate licensePlate) {
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.licensePlate = licensePlate;
        chasisNumber++;
    }

    public LicensePlate getLicensePlate() {
        return  this.licensePlate;
    }

    public void totalCars(){
        System.out.println("Total Cars: " + chasisNumber);
    }

    @Override
    public String toString() {
        return "<" + String.valueOf(this.chasisNumber) + ">: (Brand: " + this.brand + ", Year: " + String.valueOf(this.year) +
                ", Model: " + this.model + ", License Plate: " + this.getLicensePlate().toString() + ")";
    }
}
