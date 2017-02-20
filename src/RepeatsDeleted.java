/**
 * Write a static method called deleteRepeats that hasa partially filled array of characters as a formal parameter and that deletes all repeated letters from the array.
 * Because a partially filled array requires two arguments, the method should actually have two parameters: an array parameter and a formal parameter of type int that gives the number of array positions used.
 * When a letter is deleted, the remaining letters are moved up one position to fill in the gap. This creates empty positions at the end of the array so that the less of the array is used. Because the formal parameter is partially filled array,
 * a second formal parameter cannot be changed by a JAVA method, so have the method return the new value for this parameter.
 */
public class RepeatsDeleted {
    public static void main(String[] args){
        char[] yours = new char[6];
        yours[0] = 'a';
        yours[1] = 'a';
        yours[2] = 'a';
        yours[3] = 'c';

        int size = 4;

        size = deleteRepeats(yours,size);
        System.out.println("Size of array without repeats is: " + size);

    }


    public static int deleteRepeats(char[] array, int arrayPositionsUsed){
        int index;
        int noRepeats = arrayPositionsUsed;
        for(index = 0; index < arrayPositionsUsed; index++){
            if (indexOfRepeat(array, array[index],index) > 0){
                noRepeats = noRepeats - indexOfRepeat(array, array[index],arrayPositionsUsed);
            }


        }

        return noRepeats;
    }

    private static int indexOfRepeat(char[] a, char charSearch, int startIndex){
        int index;
        int countofRepeats = 0;
        for (index = startIndex; index < a.length; index++){
            if(a[index] == charSearch){
                countofRepeats = countofRepeats + 1;
            }
        }
        System.out.println("Number of repeats is: " + countofRepeats);
        return countofRepeats;
    }
}


// solved by Sayaan