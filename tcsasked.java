import java.util.*;

public class tcsasked {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        ArrayList<ArrayList<Object[]>> list = new ArrayList<>();


        int n = sc.nextInt();

        sc.nextLine();

        for(int i = 0; i < n ; i++){

            ArrayList<Object[]> input = new ArrayList<>();

            while(true){

                String first = sc.nextLine();

                int[]values = new int[3];

                int s = 1;

                values[0] = s;

                double second = sc.nextDouble();
                int third = sc.nextInt();

                values[1] = (int) second;
                values[2] = (int) third;

                input.add(new Object[]{values[1] , values[2]});

                s++;

                list.add(input);
            }
        }
        sc.close();


        int result = 0;

        for (int i = 0; i < list.size(); i++) {

            ArrayList<Object[]> testcases = list.get(i);

            for (Object[] item : testcases) {

                double item1 = (double) item[1];
                int item2 = (int) item[2];

                result += (item1 * item2);
            }
        }
        System.out.print(result / list.size());
    }
}
