import java.util.Scanner;

public class java26 {
    public static void printFibonacci(int num){     // function
        /*int a=0,b=1,c;

        while(a<=num){
            System.out.print(a  +" ");
            c=a+b;
            a=b;
            b=c;
        }*/

        int a=0,b=1,c=0;
        for(int i=0; a<=num; i++){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;

        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number"); // input
        int num = sc.nextInt();
        printFibonacci(num); // function call

    }
}
