import java.util.Scanner;

/**
 * Created by Admin on 2/19/17.
 */
public class SelectionSort {

    public static void sort(int[] array, int numberUsed ){
        int index, indexOfNextSmallest;

        for(index = 0; index < numberUsed -1; index++){
            indexOfNextSmallest = indexofSmallest(array,index,numberUsed);
            interchange(indexOfNextSmallest,index,array);
        }
    }


    // returns index of the smallest
    private static int indexofSmallest(int[] array, int startindex, int numberUsed){
        int min = array[startindex];
        int indexOfMin = startindex;
        int index;

        for (index = startindex + 1; index < numberUsed-1; index++){
            if(array[index] < min){
                min = array[index];
                indexOfMin = index;
            }

        }
        return indexOfMin;
    }

    private static void interchange(int i, int j, int[] array){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp; // orginal value of a[i]
    }

    private static int[] getArray(){
        Scanner keys =  new Scanner(System.in);
        System.out.println("Please enter how many numbers you would like to be sorted would like sorted:");
        int numberUsed = keys.next();
        int[] temp = new int[numberUsed];

        System.out.println("please enter the " + numberUsed + " as a list without commas to be sorted");
        int index;
        for (index = 0; index < numberUsed; index++){
            temp[index] = keys.next();
        }

        return temp;
    }


}
