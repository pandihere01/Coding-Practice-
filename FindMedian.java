/*
 * Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5
 */

import java.util.*;

public class FindMedian {
    public static double tofindresult(int[] arr){

        int n = arr.length;

        double odd_sum = 0;

        Arrays.sort(arr);

        int mid = 0;
        int mid_1 = 0;

        double even_sum = 0;


        if(n % 2 == 1){

            for(int i = 0; i < n ; i++){

                odd_sum += (double) arr[i];
            }
            return odd_sum/n;
        }
        else{
            
            mid = n/2-1 ; //2 [1,1,1,1]
            mid_1 = n/2 ; //[]
            
            even_sum += (double) (arr[mid] + arr[mid_1])/2;

            return even_sum;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(tofindresult(arr));

        sc.close();
    }
}
