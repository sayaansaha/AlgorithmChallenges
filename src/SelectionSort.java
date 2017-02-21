/**
 * Created by Admin on 2/20/17.
 */
public class SelectionSort {

    public static void sort(int[] a, int numberUsed){
        int index, indexOfNextSmallest;
        for(index = 0; index < numberUsed - 1; index++){
            indexOfNextSmallest = indexOfSmallest(index,a,numberUsed);
            interchange(index, indexOfNextSmallest,a);
        }
    }


    private static int indexOfSmallest(int startIndex, int[] a, int numberUsed){
        int min = a[startIndex];
        int indexOfMin = startIndex;
        int index;

        for(index = startIndex +1; index < numberUsed; index++){
            if(a[index] < min){
                min = a[index];
                indexOfMin = index;
            }
            return indexOfMin;
        }
    }

    private static void interchange(int i, int j, int[] a){
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
