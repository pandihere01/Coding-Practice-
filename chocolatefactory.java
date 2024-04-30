/*
 * N=8 and arr = [4,5,0,1,9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O
should be pushed towards the end of the array

Input :

8  – Value of N

[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is 
separated by newline

Output:

4 5 1 9 5 0 0 0

Example 2:

Input:

6 — Value of N.

[6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is 
separated by newline

Output:

6 1 8 2 0 0
 */


 import java.util.*;

 public class chocolatefactory{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){

            arr[i] = sc.nextInt();
        }
        
        int[] result = new int[n];

        int k = 0;

        for(int num : arr){

            if(num != 0){

                result[k] = num;
                k++;
            }
        }

        while(k < n){

            result[k] = 0;
            k++;
        }

        for(int ans : result){

            System.out.print(ans + " ");
        }
        sc.close();
    }
 }