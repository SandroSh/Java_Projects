public class IntDoubleListElement {
    private int info;
    public IntDoubleListElement prev;
    public IntDoubleListElement next;

    public IntDoubleListElement(int info, IntDoubleListElement prev, IntDoubleListElement next) {
        this.info = info;
        this.prev = prev;
        this.next = next;
    }

    public int getInfo() {
        return info;
    }
    public boolean isEqual(IntDoubleListElement other){

        if(this.info != other.getInfo()) return false;

        return true;
    }


}
