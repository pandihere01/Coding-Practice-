/*
 * 
 * Example 1:
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3,_,_,_,_]

Explanation:
 Total number of unique elements are 3, i.e[1,2,3] and Therefore 
 return 3 after assigning [1,2,3] in the beginning of the array.

Example 2:
Input:
 arr[1,1,1,2,2,3,3,3,3,4,4]

Output:
 arr[1,2,3,4,_,_,_,_,_,_,_]

Explanation:
 Total number of unique elements are 4, i.e[1,2,3,4] and Therefore
return 4 after assigning [1,2,3,4] in the beginning of the array.
 */

 import java.util.*;
 
public class RemoveDuplicate {
    
    public static int tofindresult(int[] arr){

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){

            set.add(num);
        }

        int n = set.size();

        int k = 0;
        for(int num : set){
            
            arr[k] = num;
            k++;
        }
        return n;
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
