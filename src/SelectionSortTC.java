import java.util.Scanner;

/**
 * Test Cases of Selection Sort
 */
public class SelectionSortTC {
    public static void main(String[] args){
        Scanner keys =  new Scanner(System.in);
        System.out.println("Please enter how many numbers you would like to be sorted would like sorted:");
        int numberUsed = keys.next();
        int[] temp = new int[numberUsed];

        System.out.println("please enter the " + numberUsed + " as a list without commas to be sorted");
        int index;
        for (index = 0; index < numberUsed; index++){
            temp[index] = keys.nextInt();
        }

        SelectionSort.sort(temp,numberUsed);

        System.out.print(temp);

}
