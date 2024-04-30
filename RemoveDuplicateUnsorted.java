/* Example 1:
Input: arr[]={2,3,1,9,3,1,3,9}
Output:  {2,3,1,9}

Explanation: Removed all the duplicate elements

Example 2:
Input: arr[]={4,3,9,2,4,1,10,89,34}
Output: {3,4,9,2,1,10,34,89}
Explanation: Removed all the duplicate elements
 */

import java.util.*;

public class RemoveDuplicateUnsorted {
    
    public static List<Integer> tofindresult(int[] arr){

        List<Integer> result = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){

            if(!set.contains(num)){

                set.add(num);

                result.add(num);
            }
            else{
                continue;
            }
        }
        return result;
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
