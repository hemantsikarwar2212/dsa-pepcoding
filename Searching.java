public class Searching {
    public static void main(String[] args) {
        int[] arr = Arrayutility.input();
        boolean check = linearSearch(arr , 4);
        if (check){
            System.out.println("yes present ");
        }
        else {
            System.out.println("not present");
        }
    int result  = binarySearch(arr , 5);
        System.out.println(result);
    }
    public static boolean linearSearch(int[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                return true;
            }

        }
        return false;
    }
    public static int binarySearch(int[] arr , int element ){
        int left = 0;
        int right = arr.length-1;
        int mid ;
        while(left <= right){
            mid = left + (right - left /2);
            if(arr[mid] == element) return mid;
            else if (arr[mid] > element ) {
                right = mid -1;
            } else if (arr[mid] < element) {
                left = mid +1;
            }
        }
        
        
        
        return -1;
    }
}
