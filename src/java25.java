import java.util.Scanner;

public class java25 {

    public static void printOdd(int n){         // function to find the odd number
        for(int i=1; i<=n; i++){
          if(i%2!=0){
              System.out.print(i+" ");
          }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
         printOdd(num);          // function call
    }
}
