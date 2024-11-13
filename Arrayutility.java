import java.util.Arrays;
import java.util.Scanner;

public class Arrayutility {
    public static int[] input() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the array size");
                int size = sc.nextInt();
                int[] arr1 = new int[size];
                for (int i = 0; i< arr1.length;i++){
                    System.out.print("Enter the Element number " + (i+1)  + " : ");
                    arr1[i] = sc.nextInt();
                }
                return arr1;
    }

}
