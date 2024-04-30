import java.util.*;

public class HalfPyramidAlpha {
    
    public static void tofindresult(int num){

        for(int i = 0; i < num ; i++){

            char curr = 'A';

            for(int j = 0; j < num ; j ++){

                if(j <= i){

                    System.out.print( (char) (65 + i) + " ");
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
