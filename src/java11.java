/*
* java program to print Hollow rectangle
*/

public class java11 {
    public static void main(String[] args) {

        int x=4;
        int y=5;

        for(int i=1; i<=x; i++){

            for(int j=1; j<=y; j++){

                if( i == 1 || j == 1 || i == x || j == y){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
