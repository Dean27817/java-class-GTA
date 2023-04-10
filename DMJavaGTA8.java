/*Author: dean morgan
 * date: 4/9/2023
 * class: csc 160
 * assignment 
 * this will be a program to show compotince and understanding with 2D arrays and sorting algotithems
 *  
 */

public class DMJavaGTA8 {


    /*  Author:	Dean Morgan
**  Date:	4/9/2023
**  Description:	sorts an array
**  Parameters:	array1 (int array)
**  Calling method:	main
**  Return values:   none
*/
    public static void arraySorter(int[] array1) {
        int holder;
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array1.length - 1; j++)
            {
                if (array1[j] > array1[j + 1])
                {
                    holder = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = holder;
                }
            }
        }
        for (int i = 0; i < array1.length; i++)
        {
            System.out.println(array1[i]);
        }
    }

    public static void main(String[] args) {
        int[] array1 = {22, 54, 2, 10, 19, 104, 16, 73, 88, 5};
        for (int i = 0; i < array1.length; i++)
        {
            System.out.println(array1[i]);
        }
        System.out.println("now sorted");
        arraySorter(array1);
        System.out.println("it is called a bianry search because the it only looks at two items at a time");
        //////////////////////////////////////////////////////////////////////////Part One

        int[][] num = {{1 , 2, 3, 4, 5, 6, 7, 8, 9, 10}, {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000}, {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000}, {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000}};
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.print(num[i][j] + ", ");
            }
            System.out.println();
        }
        String[][] planetArray = {{"mars", "venus"}, {"saturn", "earth"}};
        System.out.println(planetArray[0][1]);
        System.out.println(planetArray.length);
        System.out.print(planetArray[0][0] + ", ");
        System.out.println(planetArray[0][1]);
        /////////////////////////////////////////////////////////////////////////////////////Part Two


    }
}

