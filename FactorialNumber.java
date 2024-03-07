//Write a java function that calculate the factorial of the given number.
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int fact = factorial(num);
        System.out.println(fact);

    }
    public static int factorial(int num){
        if(num < 2){
            return 1;
        }
        int fact = 1;
        int i = 2;
        while (i <= num){
            fact*= i;
            i ++;

        }
        return fact;
    }
}
