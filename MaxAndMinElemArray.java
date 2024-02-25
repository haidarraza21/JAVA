//Create a program to find the maximum and minimum element in an array.
import java.util.Scanner;
public class MaxAndMinElemArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i<arr.length){
            System.out.print("Please enter the element of an array "+(1+i) + " : ");
            arr[i]=input.nextInt();
            i++;
        }
        int max =max(arr);
        int min =min(arr);
        System.out.println("Max value of an Array is: " + max);
        System.out.println("Min value of an Array is: " + min);
    }
    public static int max (int[]arr){
        if (arr.length == 0){
            return  Integer.MIN_VALUE;
        }
        int max =arr[0];
        int i =1;
        while (i< arr.length){
            if (max<arr[i]){
                max=arr[i];
            }
            i++;
        }

        return max;
    }
    public static int min (int[]arr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i<arr.length){
            if (min>arr[i]){
                min=arr[i];
            }
            i++;
        }

        return min;
    }
}
