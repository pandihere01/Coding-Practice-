import java.util.*;

public class HalfPyramidNum {
    public static void tofindresult(int num){

        for(int i = 1; i < num+1 ; i++){

            for(int j = 1 ; j < num+1 ; j++){

                if(j <= i){

                    System.out.print(j + " ");
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
