/*
* program to print half piramid
*/

public class java12 {
    public static void main(String[] args) {

        int x=5;
        //half pyramid
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        // inverted half pyramid
        for(int i=x; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
