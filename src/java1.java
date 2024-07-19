/*
* program for  print stars 1 to 10
*/

import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
       //input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int x= sc.nextInt();

        //logic for printing the pattern
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println(""); // for print in the line break
        }
    }
}
