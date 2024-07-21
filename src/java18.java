/*
*
* java program to print solid rhombus
*/

public class java18 {
    public static void main(String[] args) {

        int n=6;
        for(int i=1; i<=n; i++){
            /*  for(int j=n; j>=i; j--){          // to print the space another logic
                System.out.print(" ");
            }  */
            for(int j=1; j<=n-i; j++){           // to print the space
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){           // to print the star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
