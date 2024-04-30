/*
 * Example 1:
Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
Output: 2 2 2 1 1 3 3 4 
Explanation: Since  2 is present 3 times in an array ,
so print it 3 times ,then print ‘1’ 2 times and then 
‘3’ 2 times and 4 has least frequency, it will be printed
at last.

Example 2:
Input: N = 6, array[] = {-199,6,7,-199,3,5}
Output: -199 -199 3 5 6 7
Explanation: Since -199 is present 2 times so it will be
 printed at first , then 3 , 5 ,6 ,7 are present once in
array , so print them in their sorted order.
 */

import java.util.*;

public class SortElementsOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        tofindresult(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void tofindresult(int[] arr){

        Map<Integer , Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        Comparator<Integer> comparator = (a, b) -> {
            int freqCompare = Integer.compare(map.get(b), map.get(a)); // Compare frequencies in descending
                                                                               // order
            return freqCompare != 0 ? freqCompare : Integer.compare(a, b); // If frequencies are equal, compare values
        };

        // Sort the array using the comparator
        Arrays.sort(arr, comparator);
    }  
}
