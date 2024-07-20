/*
* program to find square root of a number using class and function
*/

import java.lang.*;
import java.util.*;

class Sqrt{
    //function to find the square root
    public void getSqrt(float x){
        System.out.println("Square Root of number ="+Math.sqrt(x));
    }
}

public class java5 {
    public static void main(String[] args) {
        //creating objects
        Scanner cs=new Scanner(System.in);
        Sqrt r=new Sqrt();
        //taking input
        System.out.println("Enter a number");
        float x = cs.nextInt();
        // function call
        r.getSqrt(x);

    }
}
