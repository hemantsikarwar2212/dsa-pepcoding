public class q1395Leetcode {
    public static void main(String[] args) {
        int[] arr = {454,54,4436,555};

        System.out.println(countEvenDigits(arr));
    }
    public static int CountDigit(int num ){
        int count=0;
        int i = 0;
        while(num > 0){
            num/=10;
            count++;
        }
        return count;
    };
    public static int countEvenDigits(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(CountDigit(arr[i])%2==0){
                count++;
            }
        }
        return count;
    }
    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
               sum +=accounts[row][col];
            }
            if(sum>ans){
                ans=sum;
            }

        }
        return ans;
    }

    public static int[][] flipAndInvertImage(int[][] image) {
//       int[][] newarr = new int[image.length][];

        for (int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;

            // Reverse the current row
            while (left <= right) {
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;
                left++;
                right--;

            }

        }
        return image;
    }

}
