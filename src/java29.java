import java.util.Scanner;

public class java29 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the no of names"); // input
        int size= sc.nextInt();
        String [] names= new String[size];  // declaring array

        for(int i=0; i< names.length; i++){ // input array
            System.out.print("Enter each Name");
            names[i]=sc.next();
        }
        // output
        for(int i=0; i< names.length; i++){
            System.out.println("name "+ (i+1) +" is "+names[i]);
        }

    }
}
