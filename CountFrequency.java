/*
Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	     5  2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
	    3  1
        4  2
Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array
*/

import java.util.*;

public class CountFrequency {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){

            arr[i] = sc.nextInt();
        }

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length ; i++){

            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }

        for(int num : map.keySet()){

            int frequency = map.get(num);

            System.out.println(num + "  " + frequency);
        }
        sc.close();
    }
}
