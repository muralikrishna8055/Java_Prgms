/*
* program to take 2 input and print their sum
*/
import java.util.*;

public class java3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,sum=0;
          // input
        System.out.println("Enter Two Numbers");
          a=sc.nextInt();
          b= sc.nextInt();
          // addition
          sum=a+b;
          // output
        System.out.println("sum="+sum);
    }
}
