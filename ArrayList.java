//arraylist.java
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class converts arrays to ArrayLists and vice versa.
 */
public class ArrayConverter {
    public static ArrayList<Integer> arrayToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }

    public static int[] arrayListToArray(ArrayList<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
