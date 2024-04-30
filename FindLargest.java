/*
 * Example 1:
Input:
 arr[] = {2,5,1,3,0};
Output:
 5
Explanation:
 5 is the largest element in the array. 

Example2:
Input:
 arr[] = {8,10,5,7,9};
Output:
 10
Explanation:
 10 is the largest element in the array
 */

 import java.util.*;

 public class FindLargest{
    public static int largestnumber(int[] arr){

        int max = Integer.MIN_VALUE;

        for(int  num : arr){

            if(num > max){

                max = num;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("The largest number is " + largestnumber(arr));
        sc.close();
    }
 }