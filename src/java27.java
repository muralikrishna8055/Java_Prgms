/*
* java program to declare an array
*/

import java.util.Scanner;

public class java27 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of elements ");
        int size= sc.nextInt();  // size
        int[] num = new int[size]; //array declaration

        for(int i=0; i<size; i++){   // input for array
            System.out.println("Enter the "+ i +"th element");
            num[i]=sc.nextInt();
        }

        System.out.println("The entered elements");
        for(int i=0; i<size; i++){   // output
            System.out.print(num[i]+" ");
        }



      
    }
}
