//evenoddsorter.java
import java.util.ArrayList;

/**
 * This class separates even and odd numbers from an array.
 */
public class EvenOddSorter {
    public static void sortEvenOdd(int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
    }
}
