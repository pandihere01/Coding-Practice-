import java.util.*;

public class HalfPyramid{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        tofindresult(n);

        s.close();
    }

    public static void tofindresult(int n){

        for(int i = 0; i < n ; i++){

            for(int j = 0 ; j <= i ; j ++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}