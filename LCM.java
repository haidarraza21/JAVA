//Create a java program to find the least Common Multiple (LCM) of the numbers
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();
        int lcm= lcm(first,second);
        System.out.println("LCM of two number is: "+lcm);


    }
    public static int lcm (int first, int second){
        int i =1;
        while (true){
            int factor =first * i;
            if (factor% second == 0){
                return factor;
            }
            i++;
        }

    }
}
