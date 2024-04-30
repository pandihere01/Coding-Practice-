/*
 * Example 1:
Input:
 [1,2,4,7,7,5]
Output:
 Second Smallest : 2
	Second Largest : 5
Explanation:
 The elements are as follows 1,2,3,5,7,7 and hence second largest 
of these is 5 and second smallest is 2

Example 2:
Input:
 [1]
Output:
 Second Smallest : -1
	Second Largest : -1
Explanation:
 Since there is only one element in the array, it is the largest and 
 smallest element present in the array. There is no second largest or
  second smallest element present.
 */

import java.util.*;

public class SecondSmallestSecondLargest {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){

            arr[i] = sc.nextInt();
        }

        int secondLargest = 0;
        int secondSmallest = 0;

        if(arr.length == 1){

            secondLargest = -1;
            secondSmallest = -1;
        }
        else{

            Arrays.sort(arr);

            HashSet<Integer> set = new HashSet<>();

            for(int num : arr){

                set.add(num);
            }

            int[] result = new int[set.size()];

            int j = 0;

            for(int num : set){

                result[j] = num;
                j++;
            }

            secondLargest = result[result.length - 2];

            secondSmallest = result[1];

        }

        System.out.println("The second largest is "+ secondLargest);
        System.out.println("The second smallest is " + secondSmallest);


        sc.close();

    }
}
