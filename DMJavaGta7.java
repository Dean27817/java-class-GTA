import java.util.ArrayList;
import java.util.Scanner;;
public class DMJavaGta7{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /////////////////////////////////////////////////////////////////////////////part 1
        int[] array1 = new int[5];
        /////////////////////////////////////////////////////////////////////////////Q1
        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = i+1;
        }
        /////////////////////////////////////////////////////////////////////////////Q2
        System.out.println("array is " + array1.length + " elements long");
        /////////////////////////////////////////////////////////////////////////////Q3
        System.out.println("element 4 is " + array1[4]);
        /////////////////////////////////////////////////////////////////////////////Q4
        System.out.println("element 5 is");
        System.out.println("I removed the last one because it broke the code");
        /////////////////////////////////////////////////////////////////////////////Q5
        float[] array2 = new float[10];
        for(int i = 0; i < array2.length; i++)
        {
            array2[i] = (float)(Math.random() * 10 + 1);
        }
        /////////////////////////////////////////////////////////////////////////////Q6-10
        System.out.println("array item index 5 is the number 6");
        /////////////////////////////////////////////////////////////////////////////Q11
        for(int i = 0; i < array2.length; i++)
        {
            System.out.println("array number " + i + " is " + array2[i]);
        }
        /////////////////////////////////////////////////////////////////////////////Q12-14

        /////////////////////////////////////////////////////////////////////////////Part 2
        System.out.println("it is a list of objects");
        /////////////////////////////////////////////////////////////////////////////Q1
        System.out.println("option 1, 2 and 3");
        /////////////////////////////////////////////////////////////////////////////Q2
        ArrayList <String> cars = new ArrayList<String>();
        cars.add("BMW M4");
        cars.add("Shelby GT500KR");
        cars.add("Alpine A110 S");
        cars.add("Shelby GT500");
        cars.add("Toyota GR Supra");
        /////////////////////////////////////////////////////////////////////////////Q3
        System.out.println("the car at index 3 is " + cars.get(3));
        /////////////////////////////////////////////////////////////////////////////Q3 pt 2 (its in the doc twice for some reason)
        System.out.println("the size of the array is " + cars.size());
        /////////////////////////////////////////////////////////////////////////////Q4
        System.out.println("I will now remove item at index 3");
        cars.remove(3);
        /////////////////////////////////////////////////////////////////////////////Q5
        for(int i = 0; i < cars.size(); i++)
        {
            System.out.println("item at index " + i + " is " + cars.get(i));
        }
        System.out.println("the whole list at once is " + cars);
        /////////////////////////////////////////////////////////////////////////////Q6
    }
}