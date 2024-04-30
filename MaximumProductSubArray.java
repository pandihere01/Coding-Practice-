
/*
 * Example 1:
 * 
Input:
 Nums = [1,2,3,4,5,0]
Output: 120
Explanation:
 In the given array, we can see 1×2×3×4×5 gives maximum 
 product value.

Example 2:
Input:
 Nums = [1,2,-3,0,-4,-5]
Output: 20
Explanation:
 In the given array, we can see (-4)×(-5) gives 
 maximum product value.
 */

 import java.util.*;

public class MaximumProductSubArray {
    public static int tofindresult(int[] nums){

        int finalresult = 0;

        int curr_max = 1;

        for(int i = 0; i < nums.length ; i++){

            if(nums[i] == 0 ){

                curr_max = 1;

                if(i < nums.length-1 ){
                    i++;
                }
                else{
                    continue;
                }
            }

            curr_max = Math.abs(curr_max * nums[i]); //1,2,-6

            finalresult = Math.max(curr_max , finalresult);
        
        }
        return finalresult;
    }
    public static void main(String[] args){

        int[] nums = {1,2,-3,0,-4,-5};
        System.out.println(tofindresult(nums));
    }
}
