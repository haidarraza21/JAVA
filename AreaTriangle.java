//Create java a program to calculate the area of a Triangle. Area of triangle = 1/2*B*H
import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the base of the triangle :");
        int base = input.nextInt();
        System.out.print("Please enter the height of the triangle :");
        int height = input.nextInt();

        int area = (base * height)/2;
        System.out.println("The area of a Triangle is :" + area);
    }
}
