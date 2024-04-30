// input1: int[]arr = [2,4,5,6]
//input 2 : int[] arr = [3,3,3,3,3]

import java.util.*;

public class CountOfArray{

    public static int countofarray(int[] arr){

        int count = 1;

        for(int i = 1; i < arr.length ; i++){

            if(arr[i] > arr[i-1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){

        int[] arr1 = {2,4,5,6};
        int[]arr2 = {3,3,3,3,3};

        System.out.println(countofarray(arr1));
        System.out.println(countofarray(arr2));

    }

}