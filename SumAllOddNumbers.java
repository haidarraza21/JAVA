//Create a program to sum all odd numbers from 1 to a specified number N.

import java.util.Scanner;

public class SumAllOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of the N: ");
        int num = input.nextInt();
        int sum =oddSum(num);
        System.out.println("OddSum till " +num + " is: "+ sum);

    }
    public static int oddSum(int num){
        int sum =0;
        int i =1;
        while (i<= num){
            sum = sum + i;
            i = i +2;
        }
        return sum;
    }
}
