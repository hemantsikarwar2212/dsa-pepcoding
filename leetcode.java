import java.util.Scanner;

public class leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = sc.next();
        String str= "" ;
        if (n%2==0 ) System.out.println("number is even");
        if (n%2!=0 ) System.out.println("number is odd");
        int revnum=0;
        int rem = 0;
        while(n!=0){
            rem = n%10;
            revnum = (revnum*10) + rem;
            n=n/10;
        }
        System.out.println(revnum);
        for (int i= s.length()-1 ; i >=0;i--){
            str+=s.charAt(i);
        }
        System.out.print(str);
    }
    
}
