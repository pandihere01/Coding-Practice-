/*
 * Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order
and next three elements are in the descending order.

Example 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8
 */

import java.util.*;

public class RearrangeIncDecOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            res[i] = sc.nextInt();
        }

        Arrays.sort(res);

        int[] result = new int[res.length];

        for(int i = 0; i < res.length/2 ; i++){

            result[i] = res[i];
        }

        int k = res.length / 2;

        for(int i = res.length-1 ; i >= res.length/2 ; i--){

            result[k] = res[i];

            k++;
        }
        
        for(int num : result){

            System.out.print(num + " ");
        }
        sc.close();
    }
}
