public class Search {
    static void linearSearch(int[]array, int value){
        for (int i = 0; i < array.length; i++) {
            if(value==array[i]){
                System.out.println(array[i]);
            }
        }
    }

    static int binarySearch(int[]array, int value, int left, int right){
        if(right>=left){
            int mid = (right+left)/2;
            if(value<mid){
                return binarySearch(array,value,left,mid-1);
            } else if(value==mid){
                return mid;
            } else {
                return binarySearch(array,value,mid+1,right);
            }
        }
        return -1;
    }
}
