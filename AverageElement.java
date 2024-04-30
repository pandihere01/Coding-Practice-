/*
 * Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 3
Explanation: Average is the sum of all the elements divided by number 
of elements.Therefore (1+2+3+4+5)/5 = 3.

Example 2:
Input:  N=6, array[] = {1,2,1,1,5,1}
Output: 1.8
Explanation: Average is the sum of all the elements divided by number
of elements.Therefore (1+2+1+1+5+1)/6 = 1.8
 */

import java.util.*;

public class AverageElement{
    public static double tofindresult(int n , int[] arr){

        double sum = 0;

        double average = 0.0;

        for(int i = 0; i < n ; i++){

            sum += (double) arr[i];
        }

        average = sum / n ;

        return average;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){

            arr[i] = sc.nextInt();
        }

        System.out.println(tofindresult(n, arr));

        sc.close();
    }    
}
