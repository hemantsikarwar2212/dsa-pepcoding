import java.util.Arrays;
import java.util.Scanner;

 class challenges {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
         int[] nums = {0,1,0,2,3,0,4,0};
         int j = nums.length - 1;
         int a=0;
         int b=0;
         int ans[]=new int[j];
         for (int i = 0; i < nums.length - 1; i++) {
             if (nums[i] != 0) {
                 ans[a]=nums[i];
                 a++;
             }
             else {
                 b++;
             }
         }
         while(b>0){
             ans[a]=0;
             b--;
             a++;
         }
         for (int i = 0; i < nums.length-1; i++) {
             System.out.print(ans[i] + "");
         }

     }
 }






