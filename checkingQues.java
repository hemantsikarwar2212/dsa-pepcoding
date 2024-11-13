import java.util.Arrays;

public class checkingQues {
    public static boolean wordexist(char[][] board , String word){
        String wordexist = "";
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                for (int i = 0; i < word.length(); i++) {
                    if(board[row][col]==word.charAt(i)){
                        return true;
                    }
                }
            }

        }



        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {414,55,5677,58,55,44},
                {4,5,62,3,6,7,4},
                {78,88,99,66,33,221,4}
        };
        int[] result = SearchIn2d(arr,5677);
        System.out.println(Arrays.toString(result));
    }
    public static int[] SearchIn2d(int[][] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }



}
