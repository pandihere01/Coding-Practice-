/*
 * 
 * Example 1:
  Input: N = 5, array[] = {1,2,3,4,5}
Output: 15
Explanation: Sum of all the elements is 1+2+3+4+5 = 15

Example 2:
Input:  N=6, array[] = {1,2,1,1,5,1}
Output: 11
Explanation: Sum of all the elements is 1+2+1+1+5+1 = 11
 */


import java.util.*;

public class SumofArray {
    
    public static int tofindsum(int n , int[] arr){

        int result = 0;

        for(int i = 0; i < n ; i++){

            result += arr[i];
        }

        return result;
    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number :");

        int n = sc.nextInt();

        int[] result = new int[n];

        for(int i = 0; i < n ; i++){

            result[i] = sc.nextInt();
        }

        System.out.println(tofindsum(n , result));

        sc.close();
    }
}
