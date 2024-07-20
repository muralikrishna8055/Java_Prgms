/*
*Menu driven program using java
*/

import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int option;
        // menu
        do{
            System.out.println("Enter Student Mark");
            int Mark =sc.nextInt();

            if(Mark>=90 && Mark<=100){
                System.out.println("EXCELLENT");

            }else if( Mark<=89 && Mark >=60){
                System.out.println("GOOD");

            }else if(Mark<=59 && Mark>=1){
                System.out.println("NEED IMPROVMENT");

            }else{
                System.out.println("INVALID");
            }

            System.out.println("Do you want to continue y=1/N=0");
            option=sc.nextInt();

        }while(option==1);

    }
}
