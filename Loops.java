import java.util.Arrays;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr1 = Arrayutility.input();
//        int resultedSum = sumAllpositives(arr1);
//        System.out.println("Sum is : " + resultedSum);
//        System.out.println("Your array is : " + Arrays.toString(arr1));
//        System.out.print("Enter the element you want to search  : " );
//        int element = sc.nextInt();
//        int result = countElement(arr1 , element);
//        System.out.println(result);
//        String command ;
//        do{
//            System.out.println("Enter your command : ");
//            command = sc.next();
//        }while(!command.equalsIgnoreCase("exit"));
//        System.out.println("you have exited successfully");




//        System.out.println("Please enter your Number ");
//        int num = sc.nextInt();
//        int result = factorial(num);
//        System.out.println(result);
////        String pass = "hemant@786";
//        System.out.println("Welocome ,  Set your pass ");
//        String CreatePass ;
//        int num = 4 , guess;
//        do {
//            System.out.println("Enter your number, Your guess is not Correct");
//            guess = sc.nextInt();
//        }while(num!=guess);
//        System.out.println("You won");

//        do {
//            System.out.println("please enter your pass");
//            CreatePass = sc.nextLine();
//        }while(validPass(CreatePass));
//        System.out.println("Done");
//        }


    }

    public static boolean validPass(String CreatePass) {

        return CreatePass.length()>4;
    };
//    Occurance of a specific element :
    public static int countElement(int[] arr ,int ele ){
      int count = 0;
        for (int num : arr) {
            if(num==ele){
                 count++;
            }

        }
        return count;
    };
    public static int sumAllpositives(int[] arr){
        int sum = 0;
        int i = 0;
        while(i < arr.length){
        if (arr[i] < 0 ){
           continue;
        };
           i++;
        sum+=arr[i];
        }
        return sum;
    };






}
