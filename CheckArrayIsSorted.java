//Create a java program to check iif the given array is sorted.
import java.util.Scanner;
public class CheckArrayIsSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i =0;
        while (i<arr.length){
            System.out.print("Please enter the element of an array " + (i+1) + " : ");
            arr[i]=input.nextInt();
            i++;
        }
        boolean isInc =isIncrease(arr);
        boolean isDec =isDecrease(arr);
        if ( isInc || isDec){
            System.out.println("Your array is sorted");
        }
        else {
            System.out.println("Ypor array is not sorted");
        }

    }
    public static boolean isIncrease (int[] arr){
        int i = 1;
        while (i<arr.length){
            if (arr[i]< arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecrease (int[] arr){
        int i = 1;
        while (i<arr.length){
            if (arr[i]>arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }


}
