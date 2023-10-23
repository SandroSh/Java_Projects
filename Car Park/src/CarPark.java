import java.util.HashMap;

public class CarPark {

    private int spaces;

    private int currentSpaceNum;

    HashMap<Integer,Car> parkedCars = new HashMap<Integer,Car>();
    public CarPark(int spaces) {
        this.spaces = spaces;
    }

    int park(Car c){
        if(currentSpaceNum <= spaces){
            parkedCars.put(currentSpaceNum,c);
            currentSpaceNum++;
        }

        if(currentSpaceNum  < spaces){
            return spaces- currentSpaceNum;
        }else{
            return -1;
        }
    }
    public int search(LicensePlate lp){
        if(parkedCars.containsValue(lp)){
            for (int i = 0; i < parkedCars.size() ; i++) {
                if(parkedCars.get(i).getLicensePlate() == lp){
                    return  i;
                }
            }
        }
        return -1;
    }
    public Car driveOff(LicensePlate lp){
        Car c = null;
        for (int i = 0; i <parkedCars.size() ; i++) {
            if(parkedCars.get(i).getLicensePlate() == lp){
                c = parkedCars.get(i);
                parkedCars.remove(i);
            }
        }
       return c;
    }
    public void writeOccupiedSpaces(){
        for (int i = 1; i < parkedCars.size() ; i++) {
            System.out.println(parkedCars.get(i).getLicensePlate().getDifLpFormat());
        }
    }

    @Override
    public String toString() {
        return "Car Park:";
    }
}
