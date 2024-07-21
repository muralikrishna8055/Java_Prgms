/*
* java program to find butterfly pattern
*/


public class java17 {
    public static void main(String[] args) {

        // First half
        int n=6;
        for(int i=1; i<=n; i++){                //outer loop
            for(int j=1; j<=i; j++){            // inner loop to print the first star
                System.out.print("*");
            }

            int space =2*(n-i);                 // to print the spaces
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){             // loop to print the stars
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        for(int i=n; i>=1; i--){                 // outer loop
            for( int j=1; j<=i; j++){           // inner loop to print the star
                System.out.print("*");
            }

            int space = 2*(n-i);             //  to print the space
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){        // to print the stars
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
