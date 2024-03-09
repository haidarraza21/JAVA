import java.util.Scanner;

//Create a java program to find number of occurrences of an element in an array.
public class NumberOfOccurrenceArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array occurrences");
        Scanner input = new Scanner(System.in);
        int [] numArr = ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to find: ");
        int num = input.nextInt();

        int occurrences = noOfOccurrences(numArr, num);
        System.out.println("Your element was found " + occurrences +" times in the array");
    }
    public static int noOfOccurrences(int[] numArr, int num){
        int occ =0;
        int i = 0;
        while (i < numArr.length){
            if (numArr[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
