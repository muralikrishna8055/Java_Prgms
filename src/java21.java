/*
*
*java program to print diamond pattern
*/

public class java21 {
    public static void main(String[] args) {
        int n=5;

        // first half
        for(int i=1; i<=n; i++) {      // outer loop
            for(int j=1; j<=n-i; j++){ // to print the space
                System.out.print(" ");
            }
            int star=2*i-1;   // to print the star in odd
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // second half
        for(int i=n; i>=1; i--){   // outer loop
            for(int j=1; j<=n-i; j++){ // print space
                System.out.print(" ");
            }
            int star= 2*i-1; // print star in odd
            for(int j=1; j<=star; j++){  // print the star
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
