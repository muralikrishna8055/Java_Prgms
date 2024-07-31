import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a Number");
        int x= sc.nextInt();

        /* int y= sc.nextInt();
           String c=sc.next();

     if(x%2==0) {
            System.out.println(x+"   is EVEN");
        } else {
            System.out.println(x+"   is ODD");
        }

        if(x==y){
            System.out.println("Both Number is Same");
        } else if (x>y) {
            System.out.println("first number is greater"+x+" > " + y);

        } else {
            System.out.println("Second number is greater"+y+ " < " +x);
        }

         */
        switch(x){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namasthe");
            break;
            case 3: System.out.println("Hai");
            break;
            default: System.out.println("Invalid Option");
        }

    }
}
