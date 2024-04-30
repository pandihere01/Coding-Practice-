/*
 * Input : 10  -> Integer

Output :  5 -> result- Integer

Explanation:

Binary representation of 10 is 1010. After toggling the bits(1010),
 will get 0101 which represents “5”. Hence output will print “5”.
 */

 import java.util.*;

public class Josephcal {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String binaryform  = Integer.toBinaryString(n);

        char[] chararray = binaryform.toCharArray();

        int[] resultarray = new int[binaryform.length()];

        int i = 0;

        for(char c : chararray){

            if(c == '0'){

                resultarray[i] = 1;
            }
            else{
                resultarray[i] = 0;
            }
            i++;
        }
        int result = 0;
        int power = 0;

        for(int k = resultarray.length -1 ; k >= 0 ; k--){

            result += (resultarray[k] *  (2 * power));
            power++;
        }

        System.out.print(result +1);
        sc.close();
    }
}
