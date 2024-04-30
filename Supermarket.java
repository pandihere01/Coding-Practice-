import java.util.*;

public class Supermarket {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");

        int num = s.nextInt();

        int price = 1;


        while(num > 0){

            int digit = num % 10; //5244

            price = price * digit ; //4

            num = num /10;
        }
        System.out.println("the price is :"+ price);

        s.close();
    }    
}
