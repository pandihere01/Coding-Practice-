/*
 *Example 1:
Input: N = 5, array[] = {1,2,3,4,5} K=2
Output: {3,4,5,1,2}
Explanation: Rotate the array to right by 2 elements.

Example 2:
Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
Output: {4,5,6,7,1,2,3}
Explanation: Rotate the array to right by 3 elements.
 * 
 */

import java.util.*;
 
public class RotateKElement {

    public static void toreverse(int[] arr , int start , int end){

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    
    public static void torotate(int[] arr , int k){

        int n = arr.length;

        k = k % n;

        toreverse(arr, 0, n-1);
        toreverse(arr, 0, k-1);
        toreverse(arr, k , n-1);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[]arr = new int[n];

        for(int i = 0 ; i < n ; i++){

            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        torotate(arr, k);

        System.out.println("The result is " + Arrays.toString(arr));

        sc.close();
    }
}
