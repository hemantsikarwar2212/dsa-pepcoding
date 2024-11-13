import java.util.Scanner;

public class mathAndOperators {
    public static void main(String[] args) {
//         Ternary operator :
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();;
        int c ;
        c = a<b?b : a;
        System.out.println(c);

//        switch casse :
        int day = sc.nextInt(); 

        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day");

        }
    }
}
