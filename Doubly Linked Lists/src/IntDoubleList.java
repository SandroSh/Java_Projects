public class IntDoubleList {

    private IntDoubleListElement head;
    private IntDoubleListElement tail;

    public int getLength() {
        return length;
    }

    public IntDoubleList(IntDoubleListElement head, IntDoubleListElement tail, int length) {
        this.head = head;
        this.tail = tail;
        this.length = length;
    }

    private int length = 0;

    public IntDoubleListElement getFirstElement(){
            return head;
    }
    public IntDoubleListElement getLastElement(){
        return tail;
    }
    public IntDoubleListElement append(int info){

        IntDoubleListElement newElem = new IntDoubleListElement(info,tail,null);
        this.tail = newElem;
        length++;
        return newElem;

    }

    public int size(){
        int  total =1;
        IntDoubleListElement curr = head;
        while(curr.next != null){
            total ++;
            curr = curr.next;
        }
        return total;
    }
    public int get(int pos){
        int  counter =0 ;
        IntDoubleListElement curr = head;

        while(counter < pos){
            curr = curr.next;
            counter++;
        }

        return curr.getInfo();
    }

    public void remove(int pos){
        int  counter =0 ;
        IntDoubleListElement curr = head;

        while(counter < pos){
            curr = curr.next;
            counter++;
        }
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        curr = null;
    }


    public String toString(){
        StringBuilder s = new StringBuilder();
        IntDoubleListElement curr = head;
        while(curr.next != null){
            s.append(curr.getInfo()).append(",");
            curr = curr.next;
        }
        s.append(tail.getInfo());

        return s.toString();
    }


    boolean isEqual(IntDoubleList other){
        if(this.length == other.getLength()){
            IntDoubleListElement thisCurrent = head;
            IntDoubleListElement otherCurrent = other.head;

            while(thisCurrent.next != null){
                if(thisCurrent != otherCurrent){
                    return false;
                }
                thisCurrent = thisCurrent.next;
                otherCurrent = otherCurrent.next;
            }
            if(this.tail != other.tail){
                return false;
            }

        }


        return true;
    }

    public int sum(){
        int total = 0;
        IntDoubleListElement curr = head;
        while(curr.next != null){
            total+= curr.getInfo();
            curr = curr.next;
        }
        total += tail.getInfo();
        return total;
    }

    public IntDoubleList copy(){
        return  new IntDoubleList(this.head,this.tail, this.length);
    }

    public IntDoubleListElement[] search(int intValue){
        IntDoubleListElement curr = head;
        int lengthOfArr = 0;
        while(curr.next != null){
            if(curr.getInfo() == intValue){
                lengthOfArr++;
            }
        }
        if(tail.getInfo() == intValue){
            lengthOfArr++;
        }
        IntDoubleListElement[] intDoubleListElementArr = new IntDoubleListElement[lengthOfArr];
        lengthOfArr = 0;
        while(curr.next != null){
            if(curr.getInfo() == intValue){
                intDoubleListElementArr[lengthOfArr] = curr;
                lengthOfArr++;
            }
        }
        if(tail.getInfo() == intValue){
            intDoubleListElementArr[intDoubleListElementArr.length-1] = tail;
        }

        return intDoubleListElementArr;

    }


}
