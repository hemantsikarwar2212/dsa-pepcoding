public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,8,9,66,77,88,99,100};
        int result  = binarySearch(arr,66);
        System.out.println(result);

    }
    public static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length -1 ;
        int mid ;
        while (start<=end){
             mid = start + (end-start) / 2;
             if (target > arr[mid]) start = mid + 1;
             else if (target < arr[mid]) end = mid - 1;
             else return mid;
        }
        return -1;
    }
    public static int orderAgnBinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length -1 ;
        int mid ;
        while (start<=end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            if (arr[start] < arr[end]) {
                if (target > arr[mid]) start = mid + 1;
                else if (target < arr[mid]) end = mid - 1;
            }
            else {
                if (target < arr[mid]) start = mid + 1;
                else if (target > arr[mid]) end = mid - 1;

            }
        }
        return -1;
    }
}
