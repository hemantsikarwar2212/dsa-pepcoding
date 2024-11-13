import java.util.Arrays;

public class operators {
    public static void main(String[] args) {
       int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffleArray(nums,3)));

    }
    public  static int[] shuffleArray(int[] arr , int n){

      int[] ans = new int[2*n];
        int indx = 0;
        for (int i = 0; i < n; i++) {
            ans[indx++] = arr[i];
            ans[indx++] = arr[i+n];
        }
        return ans;
    };
    public  static int[] shuffleArray(int[] arr){
        int[] ans = new int[arr.length];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
            ans[i] = sum;
        }
        return ans;
    }



    }

