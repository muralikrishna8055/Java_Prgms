/*
* program to find area using two class
*/
import java.util.*;

class Area{

    Scanner sc= new Scanner(System.in);  // creating objects
    float a,b,area;

    public void getData(){      //function
        //reading inputs
        System.out.println("Enter the Length");
         a=sc.nextFloat();
        System.out.println("Enter the Breadth");
         b= sc.nextFloat();
    }

    public void printData(){     //function
        System.out.println("Area ="+a*b);
    }

}


public class java6 {
    public static void main(String[] args) {

        Area area= new Area();   // creating objects

        // calling functions
        area.getData();
        area.printData();


    }
}
