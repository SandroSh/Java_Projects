public class Vivarium {
    private final int constructionYear;
    private final int area;
    private final Animal[] inhabitants;


    public Vivarium(int constructionYear, int area, Animal[] inhabitants) {
        this.constructionYear = constructionYear;
        this.area = area;
        this.inhabitants = inhabitants;
    }

    public int getCosts(){
        int total = 0;
        for (int i = 0; i <inhabitants.length ; i++) {
            total += inhabitants[i].getFoodCosts();
        }


        return total + (900 + (this.area*100) + (5 * this.area * (2021- constructionYear)));
    }


    public  String printInhabitants(){
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < inhabitants.length ; i++) {

            if( i == inhabitants.length -1){
                s.append(inhabitants[i].toString());
                break;

            }
            s.append(inhabitants[i].toString()).append(", ");

        }
        return s.toString();
    }
    public String toString(){

        return "[area: " + this.area + ",constructionYear: " + this.constructionYear + ", animas: " + printInhabitants() + "]";

    }
}
