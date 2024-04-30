import java.util.*;

public class TotalGreatest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){

            arr[i] = s.nextInt();
        }

        int count = 1;

        int curr = arr[0];

        for(int i = 1 ; i < arr.length ; i++){

            if(arr[i] > curr){

                count++;
            }
            else{
                continue;
            }
        }

        System.out.print("the count is " + count);
        s.close();
    }
}
