/*
 * Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.
 */

 import java.util.*;

 public class Findsmallest{
    public static int findmini(int[] arr){

        int res = Integer.MAX_VALUE;

        for(int num : arr){

            if(num < res){

                res =  num;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] arr = new int[n];


        for(int i = 0; i < n ; i++){

            arr[i] = sc.nextInt();
        }

        System.out.print(findmini(arr));

        sc.close();
    }
}