/*Create a program to calculate Perimeter of rectangle
Perimeter of rectangle ABCD = A+B+C+D*/
import java.util.Scanner;
public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value of A :");
        int A = input.nextInt();
        System.out.print("Please enter the value of B :");
        int B = input.nextInt();
        System.out.print("Please enter the value of C :");
        int C = input.nextInt();
        System.out.print("Please enter the value of D :");
        int D = input.nextInt();

        int perimeter = A+B+C+D;

        System.out.println("The perimeters of the rectangle is :" + perimeter);
    }
}
