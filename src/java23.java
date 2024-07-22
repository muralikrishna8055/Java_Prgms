/*
*java program to add 2 number using function
*/

import java.util.Scanner;

public class java23 {

    public static int addNumbers(int a,int b){            // function to add  the numbers
        return  a+b;
    }

    public static int mulNumbers(int x, int y){         // function to multiply numbers
        return x*y;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Two Numbers");  // input
        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println("sum of "+a+" and "+b+" = "+addNumbers(a,b));  // function call for addition
        System.out.println("product of "+a+" and "+b+" = "+mulNumbers(a,b)); // function call for Multiplication
    }
}
