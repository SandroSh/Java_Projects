import java.util.Arrays;

public class Zoo {
    private  Vivarium[] vivaria;

    public Zoo(Vivarium[] vivaria) {
        this.vivaria = vivaria;
    }

    public Vivarium[] getVivaria() {
        return vivaria;
    }

    public int getCosts(){
        int totalCosts = 0;

        for (int i = 0; i <vivaria.length ; i++) {
            totalCosts += vivaria[i].getCosts();
        }

        return totalCosts;
    }
    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i <vivaria.length ; i++) {
            if(i == vivaria.length-1){
                s.append(this.vivaria[i].toString());
                break;

            }
            s.append(this.vivaria[i].toString()).append(", ");
        }
        return "{" +  s.toString() + "}";
    }
}
