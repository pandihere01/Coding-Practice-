/*
 * Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element
will occupy the fifth position, the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element
will occupy the fifth position, the second element occupies the fourth position and so on.
 */

 import java.util.*;

 public class ReverseNumbers{
    public static int[] tofindresult(int n , int[] arr){

        int[]result = new int[n];

        for(int i = 0; i < n ; i++){

            result[i] = arr[arr.length-i-1];
        }
        return result;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] result = new int[n];

        for(int i = 0; i < n ; i++){

            result[i] = sc.nextInt();
        }

        System.out.println(tofindresult(n, result));
        sc.close();
    }
 }