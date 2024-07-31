/*
*program to search a element in an array
*/

import java.util.Scanner;

public class java28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input
        System.out.println("Enter the number of Elements");
        int size= sc.nextInt();
        int []num= new int [size]; // array declaration

        for(int i=0; i<num.length; i++){ // array input
            System.out.print("Enter the "+ i + "th element");
            num[i]=sc.nextInt();
        }
        // searching
        System.out.println("Enter the Number To Search"); //value to be searched
        int key= sc.nextInt();
        boolean flag=false;
        // output
        for(int i=0; i<num.length; i++){   //loop to search
            if(num[i]==key){
                System.out.println("Value Found at index"+i);
                flag=true;
            }
        }
        if(!flag){
            System.out.println("Element not found");
        }

    }
}
