// This is the class 1 that have all basic programming-
// math questions that need to be solved for basics can be used as utility class for other class :

import java.util.Scanner;

public class MathUtility {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("enter your first number :");
//        int a = input.nextInt();
       // System.out.println("enter your second number :");
//        int b = input.nextInt();
        // taking character input :
//        System.out.println("Enter the operation to be performed : ");
//        char operation = input.next().charAt(0);
//        BasicCalculator(a,b,operation);
//        checkEvenOdd(a);
//        if(checkPrime(a)){
//            System.out.println("prime number");
//        }else{
//            System.out.println("not prime number");
//        }
//        int fact  = factorial(a);
//        System.out.println(fact);
        //fibonacci(5);
//    if (isPallindrome(121)){
//        System.out.println("number is pallindrome ");
//    }else{
//        System.out.println("number is not ");
//    }
//        System.out.println(sumOfDigit(99));
//        swapping(5,10);
//      int result =   LCM(12);
//        System.out.println(result);
//        System.out.println( countDigit(12355555));
//        if (isArmstrong(153)){
//            System.out.println("number is armstrong");
//        }
//        else {
//            System.out.println("not a armstrong");
//        }
//        ReverseInt(123);
//        double root = Math.sqrt(4);
//        System.out.println(root);
//        int random =(int)Math.floor( Math.random()*1000000);
//        System.out.println(random);
//         DecimalTOBinary(12);
        int num = input.nextInt();
        int sn = 1;
        for (int i = 1; i < num; i++) {

            for (int j = 1; j < i ; j++) {
                System.out.print(sn + " ");
                sn++;



            }
           System.out.println("");
        }




    }
    // 1 .::::::::::::::::::::: BASIC CALCULATOR ::::::::::::::::
// always do the char comparation with single quote : ('') ;
    public static void BasicCalculator(int num1 , int num2 , char operation ) {
      if (operation == '*'){
          System.out.println("Your multiplication result is : " + (num1*num2));

      } else if (operation == '+') {
          System.out.println("Your addition result is : " + (num1+num2));
      } else if (operation == '-') {
          System.out.println("Your substraction result is : " + (num1 - num2)) ;
      }
      else if (operation == '/') {
          System.out.println("Your Division result is : " + (num1 / num2)) ;
      }
      else if (operation == '%') {
          System.out.println("Your Modulus result is : " + (num1 % num2)) ;
      }


    }
   // ::::::::::::::::: END OF CALCULATOR :::::::::::::::::::::::::::

    // 2 ::::: CHECKING NUMBER IS EVEN / ODD :::::::::
    public  static  void  checkEvenOdd (int num){
        if (num % 2 != 0){
            System.out.println("Entered number is Odd ");
        }
        else {
            System.out.println("Number is Even ");
        }

    }
    public static boolean checkPrime(int num){
        for (int i = 2; i <num; i++) {
            if(num % i == 0  ) {
               return false;
            }


        }
               return true;
    }
   // ::::::::::: FACTORIAL :::::::::::::::
    public static int factorial(int num){
        int fact=1;
        if(num==0) return 1;
        for (int i = 1; i <=num ; i++) {
            fact = fact*i;
        }

        return fact;
    }
    //::::::::::::::::::::fibonacci ::::::::::::::::::
    public static void fibonacci(int num){
        int a=0;
        int b =1;
        int sum = 0;
        System.out.print(a + " ");
        System.out.print(b+ " ");
        for (int i = 1; sum<num ; i++) {
            sum = a +b;
           a=b;
            b=sum;
            System.out.print(sum +" ");

        }
    }
    // :::::::::::::::::::::: pallindrome :::::::::::::::::::::
    public static boolean isPallindrome(int num){
        int sum = 0;
        int temp = num;
        int rem=0 ;
        int i = 0;
        while(num>0){
            rem = num%10;
            sum = (sum*10) +rem;
            num/=10;
            i++;
        }
        if (sum == temp){return true;}
        return false;
    };
    //::::::::::::::::::::Sum of Digit ::::::::::::::::::::::::::::
    public static int sumOfDigit(int num ){
        int sum = 0;
        int i = 0;
        int rem = 0;
        while(num > 0){
            rem = num%10;
            sum  = sum + rem ;
            num/=10;
            i++;
        }
        return sum;
    }
    public static void swapping(int a , int b ){
//        int temp = 0;
//        temp = a;
//        a = b;
//        b = temp ;
//        System.out.println("aafter swap num1 is : " + a);
//        System.out.println("second num is : " + b);
        // without temp
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("aafter swap num1 is : " + a);
        System.out.println("second num is : " + b);

    }
    //:::::::::::::::wrong::::::::::
//    public static int LCM (int num) {
//        int LCM = 1;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                LCM = LCM * i;
//                num = num / i;
//            }
//
//        }
//        return LCM;
//    }
    //:::::::::::count digit :::::::::::::
    public static int countDigit(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    };
    // :::::::::::::Armstrong Number :::::::::::::::

    public static boolean isArmstrong(int num){
        int n = num;
        int last ;
        int Armstrong = 0 ;
        int Digits = countDigit(num);
        while(n>0){
            last = n%10;
            Armstrong += (int)Math.pow(last , Digits);
            n/=10;

        }
        if (num == Armstrong)
            return true;

        return false;
    }
    //:::::::::Leap year ::::::::::::::
    public static boolean leapYear(int year ){
        if(year%4 == 0 && year%400==0 ) return true;
        if (year % 100 ==0) return false;
        return false;
    }
//::::::::::::: Reverse of a Number :::::::::::
    public static void ReverseInt(int num){
        int n = num;
        int ReversedNum = 0;
        int rem;
        while (n>0 ) {
            rem=n%10;
            ReversedNum = (ReversedNum*10) + rem;
            n/=10;

        }
        System.out.print( ReversedNum);
    }
    //::::::::::::::::::::Fahrenheit to celcius ::::::::::::::::::::::::
//    °F = °C * 9/5 + 32
//::::::::::::::::::::::::
// ::::::::Decimal to Binary :::::::::::::::::::::::::::
        public static void DecimalTOBinary (int num){
        int n = num;
        String b = "";
        while(n>0){
            b = ((n%2)+b);
//            ReverseInt(rem);
//            System.out.print(rem);
            n/=2;

        }
            System.out.print(b);

        }
}
