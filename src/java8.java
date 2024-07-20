/*
* Simple calculator using java program
*/

 import java.util.*;

public class java8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter two Numbers");
        int x= sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Enter Operation + - * / %"); // input operation
        String s= sc.next();

        switch(s){         //Switch case
            case "+":
                System.out.println("sum of number is "+ x + " + " + y + " = "+(x+y));
                break;

            case "-":
                System.out.println("subtraction of number is "+ x + " - " + y + " = "+(x-y));
                break;

            case "*":
                System.out.println("Product of number is "+ x + " * " + y + " = "+(x*y));
                break;

            case "/":
                System.out.println("Division of number is "+ x + " / " + y + " = "+(x/y));
                break;

            case "%":
                System.out.println("Reminder of number is "+ x + " % " + y + " = "+(x%y));
                break;

            default:
                System.out.println("invalid opeation");
        }
    }
}
