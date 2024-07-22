/*
*
*java program to find the factorial of number
*/

import java.util.Scanner;

public class java24 {

    public static void  calculateFactorial(int num){              // function to calculate the factorial
        int factorial=1;
        for(int i=num; i>=1; i--){
            factorial=factorial*i;
        }
        System.out.println("Factorial of Number "+num+" = "+factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a Number");  //Input
        int num= sc.nextInt();

        if(num <= 0){                                 // checking the number
            System.out.println("Factorial of 0 is 0");
        }else if(num == 1){
            System.out.println("Factorial of 1 is 1");
        }else{
            calculateFactorial(num);                 // function call
        }

    }
}
