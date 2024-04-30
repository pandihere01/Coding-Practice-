import java.util.*;


public class ReverseHalfPyramid {
    
    public static void tofindresult(int n){

        for(int i = 0 ; i < n ; i++){

            int k = 1;

            for(int j = n ; j > 0 ; j--){

                if(j > i){

                    System.out.print(k + " ");
                    k++;
                }
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
