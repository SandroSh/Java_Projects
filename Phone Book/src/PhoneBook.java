public class PhoneBook {


    private Entry[] phoneArr;

    public PhoneBook(Entry[] phoneArr) {
        this.phoneArr = phoneArr;
    }
    public String find(String firstName, String lastName){
        int start = 0;
        int end = phoneArr.length-1;
        int mid = (start + end)/2;

        while( start < end ){
            if(phoneArr[mid].getLastName().equals(lastName)){
                if(firstName.compareTo(phoneArr[mid].getFirstName()) == 0){
                    return phoneArr[mid].getPhoneNumber();
                }else if(firstName.compareTo(phoneArr[mid].getFirstName()) > 0){
                    start = mid;
                    mid = (start + end) / 2 + 1;

                }else{
                    end = mid;
                    mid = (start + end)/2 + 1;
                }

            }else if( lastName.compareTo(phoneArr[mid].getLastName()) > 0) {

                start = mid;
                mid = (start + end)/2;

            }else if( lastName.compareTo(phoneArr[mid].getLastName()) < 0){

                end = mid;
                mid = (start + end) / 2;

            }
        }
        return "Outer False";
    }

    public void print(){
        for (Entry entry : phoneArr) {
            System.out.println(entry.getFirstName() + " " + entry.getLastName() + " " + entry.getPhoneNumber());
        }
    }
}
