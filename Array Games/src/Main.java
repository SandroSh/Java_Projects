public class Main {
    public static void main(String[] args) {


//          System.out.println(isAlps(new int[]{3,5,7,10,5,1}));
//        System.out.println();
//        otherSort(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6});
        System.out.println(pinguFriends(new int[]{1,1,1,1,2,2,2,2,3,3,3,3}));
    }


    public static int[] otherSort(int[] arr1, int[] arr2){
        int counter = 0;
        int[] newArr = new int[arr1.length];

        for (int i = 0; i < arr2.length ; i++) {
            for(int k =0; k < arr1.length; k++){

                if(arr2[i] == arr1[k]){
                    newArr[counter] = arr1[k];
                    counter++;
                    arr1[k] = 0;
                }
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            if(arr1[i] != 0){
                counter = arr1[i];
            }
            if(newArr[i] == 0){
                newArr[i] = counter;
            }
        }



        for (int i = 0; i <newArr.length ; i++) {
            System.out.print(newArr[i]);
        }
        return newArr;
    }
    public static boolean isAlps(int[] arr){
        int max = 0;
        int index = 0;
        for( int k = 1; k < arr.length; k++){
            if(arr[k-1] < arr[k]){
                continue;
            }else{
                if( arr[k-1] > max){
                    max = arr[k-1];
                    index = k-1;
                }
            }
        }
        for (int i = index+1; i <arr.length ; i++) {
            if(arr[i] > max){
                return false;
            }
        }
        for(int i =1; i < index; i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }

    public static int pinguFriends(int[] arr){
        if(arr.length % 2 != 0){
            return 0;
        }
        int quantity = 0;
        int minQuantity = 100;
        for (int i = 0; i <arr.length ; i++) {
            for (int k = 0; k <arr.length; k++) {
                if (arr[i] == arr[k]) {
                    quantity++;
                }
            }
            if(quantity % 2 != 0){
                return 0;
            }
            if(quantity < minQuantity){
                minQuantity = quantity;
            }
            quantity = 0;
        }

        return minQuantity;
    }
}