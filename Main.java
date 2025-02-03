//Main.java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Sorting Even and Odd Numbers
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        EvenOddSorter.sortEvenOdd(numbers);

        // Task 2: Find smallest neighbor distance
        System.out.println("\nFinding smallest neighbor distance...");
        int index = SmallestNeighborDistance.findSmallestDistanceIndex(numbers);
        System.out.println("Index of first number in smallest pair: " + index);

        // Task 3: Convert array to ArrayList and vice versa
        ArrayList<Integer> arrayList = ArrayConverter.arrayToArrayList(numbers);
        System.out.println("\nArrayList: " + arrayList);

        int[] convertedArray = ArrayConverter.arrayListToArray(arrayList);
        System.out.println("Converted back to Array: " + Arrays.toString(convertedArray));

        scanner.close();
    }
}
