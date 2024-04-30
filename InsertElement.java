/*
 * Example:
Input: N = 5, array[] = {1,2,3,4,5}
insertbeginning(6)      [6,1,2,3,4,5]
insertending(7)
insertatpos(8,4)
Output: 6,1,2,8,3,4,5,7
Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4 
 */

import java.util.*; 

public class InsertElement {
    
    public static void insertAtbegin(int n , int[] arr , int value){

        for(int i = arr.length-1 ; i >= 0 ; i--){

            arr[i+1]  = arr[i]; // [value,1,2,3,4,5]
        }
        arr[0] = value;
    }
    public static void insertAtEnd(int n , int[] arr , int value){
        n = n + 1;
        arr[n] = value;
    }
    public static void insertAtMid(int n , int[]arr , int value , int pos){

        int mid = n - pos ; // 

        for(int i = mid; i < n ; i++){

            arr[i+1] = arr[i];
        }
        arr[mid-1] = value;            
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){

            arr[i] = sc.nextInt();
        }
        int value = sc.nextInt();

        insertAtbegin(n, arr, value);


        for(int i = 0; i < n ; i++){
            System.out.print("After inserting :" +  arr[i]);
        }
        System.out.println();
        sc.close();
    }
}
