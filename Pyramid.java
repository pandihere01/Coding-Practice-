import java.util.*;

public class Pyramid {
    public static void tofindresult(int num){

        for(int i = 1; i < num+1 ; i++){

            for(int j = num-i ; j >= 0 ; j--){

                System.out.print(" ");
            }

            for(int  j = 1 ; j <= 2 * i -1 ; j++){
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        tofindresult(n);

        s.close();
    }
}
