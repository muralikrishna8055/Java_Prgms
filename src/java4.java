/*
* program to print the multiplication table of numbers till the entered number
*/
import java.util.*;
public class java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        int x, i;
        System.out.println("Enter a Number");
        x = sc.nextInt();
        //logic for multiplication
        for (int k = 1; k <= x; k++) {
            for (i = 1; i <= 10; i++) {
                System.out.println(k + "*" + i + "=" + k * i);
            }
            System.out.println("*************************");
        }
    }
}
