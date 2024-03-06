//Create a java program to return a new array deleting a specific element.
import java.util.Scanner;
public class DeletingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of an array: ");
        int size = input.nextInt();
        int [] numArr = new int[size];
        int i = 0;
        while (i<numArr.length){
            System.out.print("Please enter the elements of an Array " + (i+1) + " : ");
            numArr[i]= input.nextInt();
            i++;
        }
        System.out.print("Now, enter the number you want to delete: ");
        int numToDelete = input.nextInt();
        int [] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array");
        displayArray(newArr);

    }
    public static void displayArray(int[]numArray){
        int i = 0;
        while (i<numArray.length){
            System.out.println(numArray[i]);
            i++;
        }
    }

    public static int[] deleteNumber(int[] numArr , int numToDelete){
        int occ = NumberOfOccurrenceArray.noOfOccurrences(numArr, numToDelete);
        if (occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new  int[newSize];

        int i = 0;
        int j = 0;
        while (i < numArr.length){
            if (numArr[i] != numToDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }

}
