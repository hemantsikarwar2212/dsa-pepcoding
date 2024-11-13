import java.util.Arrays;
import java.util.Scanner;

public class pepcodingQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number  : ");
//        int num = sc.nextInt();
//        System.out.println("Enter second  base number");
//        int num1 = sc.nextInt();
//        decimalToAnyBase(63,8);
//        System.out.println(AnyBaseToDecimal(125,8));
//        System.out.println(AnyBaseToDecimal(111,8));
//        System.out.println(anyBaseAddition(125,8,8,111));
//        GcdAndLcm(num1, num);
//        rotateNumber(num,3);
//        System.out.println("enter the number of elements : " +"");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
////        System.out.println("enter the elements : ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        //int ans = spanOfArray(arr);
//        System.out.println(ans);
        //printBarChart(arr);
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4};
        sumOfTwoArrays(arr1,arr2);



    }

    public static void rotateNumber(int number, int k) {
        int digit = countdigit(number);
        int div = 1;
        int mult = 1;
        for (int i = 0; i < digit; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }

        }
        int q = number / div;
        int r = number % div;

        int rotatedNum = r * mult + q;
        System.out.println(rotatedNum);

    }

    public static int countdigit(int num) {
        int numOfDigit = 0;
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            numOfDigit++;
        }
        return numOfDigit;
    }

    public static void GcdAndLcm(int num1, int num2) {
        int onum1 = num1;
        int onum2 = num2;
        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        int lcm = (onum1 * onum2) / gcd;
        System.out.println("Your GCD is : " + gcd);
        System.out.println("Your LCM is : " + lcm);
    }

    public static void printPrimeFact(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                if (num % i == 0) {
                    System.out.println(i);
                    num /= i;
                    i--;
                }
            }
        }

    }

    public static boolean isPrime(int num) {
        for (int i = 0; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static int decimalToAnyBase(int n, int b) {
        int ans = 0;
        int p = 1;
        while (n > 0) {
            int digit = n % b;
            n /= b;

            ans += digit * p;
            p = p * 10;
        }
        return ans;
    }

    public static int AnyBaseToDecimal(int n, int b) {
        int ans = 0;
        int p = 1;
        //p=1;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;

//            ans += digit * Math.pow(b, p);
             ans +=digit * p;
            //p++;
             p=p*b;
        }
        return ans;
    }

    public static int anyToAnyBase(int n, int b1, int b2) {
        int dec = AnyBaseToDecimal(n, b1);
        int ans = decimalToAnyBase(dec, b2);
        return ans;
    }
    public static int anyBaseAddition(int n1 ,int b1 , int b2 , int n2  ){
        int ans = 0;
        int newn1 = AnyBaseToDecimal( n1 , b1);
        int newn2 = AnyBaseToDecimal(n2 , b2);
        ans = newn1+newn2;
        int finalans = decimalToAnyBase(ans , b1);




        return finalans ;
    }
    public static int spanOfArray(int[] arr){
        int ans=0;
        int max = Integer.MIN_VALUE;
        int min  = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max= arr[i];
            }
            if (min >arr[i]){
                min = arr[i];
            }
        }
        ans = max - min ;
        return ans ;
    }
    public static void printBarChart(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for (int i = max; i >=1 ; i--) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>=i){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
    public static void sumOfTwoArrays(int[] array1, int[] array2){
        int n = Math.max(array2.length , array1.length);
        int[] ans = new int[n];
        for (int i = 0; i <n; i++) {
//  use when arr 1 and arr2 is of same lengtth
//  ans[i] = array1[i] + array2[i];
            int val1 = (i<array1.length) ? array1[i] : 0;
            int val2 = (i<array2.length)?array2[i] : 0;
            ans[i] = val2+val1;
        }

        for (int n1 : ans){
            System.out.print(n1+" ");
        }
    }
    public static void sumOfArray(int[] arr1,int[] arr2){
        int n2 = arr2.length;
        int n1 = arr1.length;
        int c = 0;
        int[] sum = new int[n1>n2 ? n1:n2];
        int i = arr1.length -1 ;
        int j = arr2.length-1;
        int k = sum.length-1;
        while(k>=0){
            int digit = c;
            if (i>=0){
                digit+=i;
            }
            if (j>=0){
                digit+=j;
            }
            c = digit/10;
            digit = digit%10;
            sum[k]=digit;
            i--;
            j--;
            k--;

            }
        if (c!=0){
            System.out.println(c);
        }
        for (int val:sum
             ) {
            System.out.println(val);

        }
        }

    }


