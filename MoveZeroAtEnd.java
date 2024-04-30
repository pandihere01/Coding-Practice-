//input1 = [1,2,0,3,5,0,7]
//input2 = [2,3,,0,1,2,3,0,8];

//output1:[1,2,3,5,7,0,0]
//output2 : [2,3,1,2,3,8,0,0]

import java.util.*;


public class MoveZeroAtEnd {

    public static int[] movezeroatend(int[] arr){

        int[] result = new int[arr.length];

        int k = 0;

        for(int i = 0; i < arr.length ; i++){

            if(arr[i] != 0){

                result[k] = arr[i]; 
                k++;
            }
        }

        while(k < arr.length){

            result[k++] = 0;
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int digit = sc.nextInt();

        int[] result = new int[digit];

        for(int i = 0; i < digit ; i++){

            result[i] = sc.nextInt();
        }

        int[] movedArray = movezeroatend(result);

        for (int num : movedArray) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
