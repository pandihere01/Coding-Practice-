/*
 * input : nums = [2,7,11,15]
 * target = 9
 * 
 * output : [0,1]
 */

public class Twosum {

    public static int[] findResult(int[] nums , int target){

        for(int i = 0 ; i< nums.length ; i++){

            for(int j = i+1 ; j < nums.length ; j++){

                if(nums[i] + nums[j] == target){

                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(findResult(nums, target));
    }
}
