
//
//public class arrays {
//    public static void main(String[] args) {
////
//         int[] myArr  = {44,55,66,77,88,99};
//         String[] newArr = {"hemant","sikarwar","shivam" , "mohit"};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number you want to search");
////       int num = sc.nextInt();
////       String str = sc.next();
////        boolean isFound = Ispresent(myArr,num);
////        boolean ispresent = Isfound(newArr,str);
////        if (ispresent){
////            System.out.println("number is present");
////        }
////        else {
////            System.out.println("number is not found");
////        }
//        // 2D arrays : it is a array of arrays;
//        // syntax : int[][] name = new int[row][column]
//        int[][] myArr1 = new int[2][3];
//        int[][] arr = {{1,2,3},{4,5,6}};
//        System.out.println();
//// traversal;
//        int i = 0;
//        while(i< arr.length){
//            int j = 0;
//            while (j<arr[i].length){
//                System.out.print(arr[i][j]);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//
//
//    }
//    public static boolean Ispresent(int[] arr , int n){
//        int i = 0;
//        while(i<arr.length){
//            if(arr[i]==n){
//                return true;
//            }
//            i++;
//
//        }
//        return false;
//    }
//    public static boolean Isfound(String[] arr , String s){
//        int i = 0;
//        while (i< arr.length){
//            if (arr[i]==s){
//                return true;
//            }
//            i++;
//        }
//
//
//
//        return false;
//
//    }
//    // 2D arrays : it is a array of arrays;
//    // syntax : int[][] name = new int[row][column]
//    int[][] myArr = new int[2][3];
//    int[][] arr = {{1,2,3},{4,5,6}};
//
//
//
//
//
//
//}

import java.util.Arrays;
import java.util.Scanner;

//#challenges
public class arrays {
    private static int[][] arr;
    private static int value;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] newArr1 = new int[size];
        int i = 0;
        while (i<size){
            newArr1[i] = sc.nextInt();


            i++;
        }
        int[] arr = {1,2,3,2,1};
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int[][] arr3 = {{1,2,3},{1,2,3}};
         int result = Sum(arr);
        int average =avg(arr);
        int occur = Occurence(arr,4);
        System.out.println("Occurence :" + occur);
        System.out.println("average is : " + average);
        int max = max(arr);
        int min = min(arr);
        System.out.println("min is : " + min);
        System.out.println("max is :"+max);
        System.out.println("sum is : "+result);
        System.out.println("array is sorted  : " + SortedOrnot(arr));
        String result1 = Arrays.toString(AfteDelete(arr,4));
        System.out.println(result1);
        System.out.println("reverse is : ");
        reverseArr(arr);
        System.out.println("arr is :"+CheckPalindrome(arr));

        int[] result2 = AfteDelete(arr,1);

        System.out.println((Arrays.toString(AfteDelete(arr,6))));
        int[] sumOf  = MergeTwoSarray(arr1,arr2);
        System.out.println(Arrays.toString(sumOf));
//        for (int i = 0; i < sumOf.length; i++) {
//            System.out.print(sumOf[i] + " ");
//        }

        boolean isfound = SearchElementIndex(arr3,8);
        if(isfound){
            System.out.println("Element is present");
        }
        else {
            System.out.println("Not present");
        }






    }

    private static int avg(int[] arr) {
        int avg = 0;

           avg= Sum(arr)/ arr.length;

        return avg;
    }

    //    q1 :
    public static int Sum(int[] arr){
        int sum = 0;
        for (int i = 0; i <= arr.length ; i++) {
            sum+=arr[i];
        }


        return sum;
    }


//    challenge 2 :
    public static int Occurence (int[] arr,int value){
        int count=0 ;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==value){
               count++;
            }
        }
        return count;


    }
//    challenge 3 :
    public static int max(int[] arr ){
        int max = 0;
        int i = 0;
        while (i< arr.length){
            if (arr[i] > max){
                max=arr[i];
            }
            i++;
        }

        return max;

    }
    public static int min(int[] arr ){
        int min = 0;
        int i = 0;
        while (i< arr.length){
            if (arr[i] < min){
                min=arr[i];
            }
            i++;
        }

        return min;

    }
//    challenge 3 ;
    public static boolean SortedOrnot(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

//     challenge 5;
    public static int[]  AfteDelete(int[] arr , int value){
        int[] newArr = new int[arr.length-1] ;
        int index=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]!=value){
                newArr[index++] = arr[i];
            }



        }
        return newArr;
    }


//    challenge 6 ;
    public static void reverseArr(int[] arr){

        for (int i = arr.length-1; i > 0; i--) {
            System.out.print(arr[i]+" ,");
        }
    }
//    challenge 6 ;
    public static boolean CheckPalindrome(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i< j){
            if(arr[i] != arr[j]){
                return false;

            }
            i++;
            j--;
        }

        return true;
    }

//     challenge 7 ;
    public static int[] MergeTwoSarray(int[] arr1 , int[] arr2){
        int N1 = arr1.length;
        int N2 = arr2.length;
        int[] newArr  = new int[N1+N2];
        int result ;
        for (int i = 0; i < N1; i++) {
         newArr[i] = arr1[i];
        }
        for (int i = 0; i < N2; i++) {
            newArr[N1+i] = arr2[i];
        }
        return newArr;
    }
//     challenge 8 ;
    public static boolean SearchElementIndex(int[][] arr ,int value){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==value){
                    return true;
                }
            }
        }


        return false;
    }





}




































