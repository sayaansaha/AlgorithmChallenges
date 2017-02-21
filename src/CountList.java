import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Admin on 2/20/17.
 */
public class CountList {
    private static int[] array = new int[50];

    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);
        boolean more = true;

        int index;
        while(more){
            for(index = 0; index < array.length; index++){
                System.out.println("Please enter a number");
                array[index] = keys.nextInt();
                System.out.println("Would you like to add another number? Please say Y or N");
                String response = keys.next();
                if("n".equalsIgnoreCase(response)){
                    more = false;
                    break;
                }

            }
        }

        System.out.println(Arrays.toString(array));

    }


    public static void arrayCounts(int[] a){
        
    }

}
