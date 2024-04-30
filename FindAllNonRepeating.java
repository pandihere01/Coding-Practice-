/*
 * Example 1:
Input:
 Nums = [1,2,-1,1,3,1]
Output:
 2,-1,3
Explanation:
 1 is the only element in the given array which occurs thrice in the array.
-1,2,3 occurs only once and hence, these are non-repeating elements of the given array.

Example 2:
Input:
 Nums = [1,2,3]
Output:
 1,2,3
Explanation:
 All elements present in the array occur once. Hence, every element is non-repeating.
 */

import java.util.*;

public class FindAllNonRepeating {

    public static List<Integer> tofindresult(int[] nums){


        List<Integer> result = new ArrayList<>();

        HashMap<Integer ,  Integer> map = new HashMap<>();

        for(int num : nums){

            map.put(num , map.getOrDefault(num , 0) + 1);
        }

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){

            int value = entry.getValue();

            if(value == 1){

                result.add(entry.getKey());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int[] nums = new int[n];

        for(int i= 0; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(tofindresult(nums));
        sc.close();
   }
}
