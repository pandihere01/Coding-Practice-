import java.util.*;

public class Airport {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){

            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int num : arr){

            System.out.print(num + " ");
        }
        sc.close();
    }
}
