/*
*java program to print * 10 to 1 inverted
*/

import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //input
        System.out.println("Enter a Number");
        int x= sc.nextInt();

        //logic
        for(int i=x;i>=1;i--){

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

            //printing the line space
            System.out.println("");
        }
    }
}
