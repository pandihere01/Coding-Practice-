/*
 * Example 1:
Input: 
Arr[] = [1,1,2,3,4,4,5,2]
Output:
 1,2,4
Explanation:
 1,2 and 4 are the elements which are occurring more than once.

Example 2:
Input:
 Arr[] = [1,1,0]
Output:
 1
Explanation:
 Only 1 is occurring more than once in the given array.
 */

import java.util.*;

public class FindAllRepeating {
    public static List<Integer> tofindresult(int[] arr){

        Arrays.sort(arr);

        HashSet<Integer> set = new HashSet<>();

        List<Integer> result = new ArrayList<>();

        for(int num : arr){

            if(!set.contains(num)){

                set.add(num);
            }
            else{
                result.add(num);
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
