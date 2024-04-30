/*
 * input : word = "abcabcbb"
 * output : 3  "abc"
 * 
 * input : bbbbbb
 * output : 1
 */

import java.util.*;

public class CountMaximumChar{
    public static int tofindmax(String word){

        int n = word.length();

        Set<Character> set = new HashSet<>();

        int result =0 ;
        int left = 0;
        int right = 0;

        while(right < n && left < n){

            if(!set.contains(word.charAt(right))){

                set.add(word.charAt(right));

                right++;

                result = Math.max(result , right - left );

            }
            else{

                set.remove(word.charAt(left));
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("pleaase enter the word :");

        String word = sc.nextLine();

        System.out.println(tofindmax(word));

        sc.close();
    }
}