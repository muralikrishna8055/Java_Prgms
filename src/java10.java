/*
* java program to print solid rectangle
*/
public class java10 {
    public static void main(String[] args) {

        //input
        int x=5;
        int y=6;

        for(int i=1;i<=x;i++){       //outer loop
            for(int j=1;j<=y;j++){  //inner loop
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
