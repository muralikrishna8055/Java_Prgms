/*
* java program to print pyramid inverted
*/

public class java13 {
    public static void main(String[] args) {

        int x=5;
           // outer loop
        for(int i=1; i<=x; i++){
            //inner loop-> print space
            for(int k=1; k<=x-i; k++){
                System.out.print(" ");
            }
            // inner loop -> print *
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
