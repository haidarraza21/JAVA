/* Java Arrays are used t store multiple values in a single variable, instead of declaring separated variables for each value.
To declare an array, define the variable type with square brackets that is String[] city;
We have now declared a variable that holds an array of strings. To insert value to it, you can place the value in a comma-separated list, inside curly bracket that is String[] city ={"Pune","Jaipur","Patna","Delhi"};
To create an array of integers, you could write: int[] myArray = {10, 23, 45, 67, 90};
 */
public class JavaArray {
    public static void main(String[] args) {
        /*
         * Access the Elements of an Array
         * You can access an array element by referring to the index number.
         * This statements accesses the value of the first element in city:
         */

        String[] city = { "Patna", "Delhi", "Jaipur", "Pune" };
        System.out.println(city[1]);

        System.out.println("...........................");
        /*
         * Change an Array Element
         * To change the value of a specific element, refer to the index number:
         */
        city[0] = "Ajmer";
        System.out.println(city[0]);
        // Now outputs Ajmer instead of Patna
        System.out.println("...........................");

        /*
         * Array Lenght
         * To find out how many elements an array has, use the lenght property:
         */

        int[] myArray = { 1, 3, 5, 7, 8, 9 };
        System.out.println(myArray.length);
        // Outputs 6
        System.out.println("...........................");

        /*
         * Loop Through an Array
         * You can loop through the array elements with the for loop, and use the lenght
         * property to specify how many times the loop should run.
         */

        for (int i = 0; i < city.length; i++) {
            System.out.println(city[i]);

        }
        System.out.println("...........................");
        /*
         * Loop Through an Array with For-Each
         * There is also a 'for-each' loop, which is used exclusively to loop through
         * elements in arrays:
         */
        for (String i : city) {
            System.out.println(i);
        }
        System.out.println("...........................");
        /*
         * The example above can be read like this: for each string elemnet (called i -
         * as in inddex) in city, print out the value of i.
         * If you compare the for loop and for-each loop, you can see that the for-each
         * method is easier to write, it does not require a counter (using the lenght
         * property), and it is more readable.
         */
        // ...............................................

        /*
         * Multidimensional Arrays
         * A Multidimensional array is an array of arrays.
         * Multidimensional arrays are useful when you want to store data as a tabular
         * form, like table with rows and columns.
         * To create a two dimensional array, add each array within its own set of curly
         * brackets:
         */

        int[][] myTwoDimensionalArray = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9, 10 } };

        // Access Elements
        System.out.println(myTwoDimensionalArray[0][2]); // Outputs 3
        System.out.println(myTwoDimensionalArray[1][5]); // Outputs 10

        System.out.println("...........................");

        // Change Element Value

        myTwoDimensionalArray[0][3] = 11;
        System.out.println(myTwoDimensionalArray[0][3]);

        System.out.println("...........................");

        // Loop Through a multi-Dimensional Array
        for (int i = 0; i < myTwoDimensionalArray.length; i++) {
            for (int j = 0; j < myTwoDimensionalArray[i].length; j++) {
                System.out.println(myTwoDimensionalArray[i][j]);
            }
        }

    }
}
