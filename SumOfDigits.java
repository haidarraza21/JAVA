//Create a program that computes the sum of the digits of an integer.
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the your number: " );
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of Digits: " + sum);
    }
    public static int sumOfDigits(int num){
        int sum =0;
        while (num>0){
             sum = sum + (num %10);
             num = num/10;
        }
        return sum;
    }
}
