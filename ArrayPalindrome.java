//Create java a program to check is the array is palindrome or not.
import java.util.Scanner;
public class ArrayPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i<arr.length){
            System.out.print("Please enter the element of an array " + (i+1) + " : ");
            arr[i] =input.nextInt();
            i++;
        }
        boolean isPalindrome = isPalindrome(arr);
        if (isPalindrome){
            System.out.println("Your array is Palindrome");
        }
        else {
            System.out.println("Your array is not Palindrome");
        }
    }
    public static boolean isPalindrome(int[] arr){
        int i = 0;
        while (i<arr.length /2){
            if (arr[i] != arr[arr.length - 1 - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
