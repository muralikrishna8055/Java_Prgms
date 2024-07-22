/*
* java program to create a function
*/

import java.util.Scanner;

public class java22 {
    public static void printMyName(String name){
        System.out.println("Your name is "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.next();
        printMyName(name);
    }
}
