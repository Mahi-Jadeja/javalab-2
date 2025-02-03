//smallestneighbor.java
/**
 * This class finds the index of two neighboring numbers with the smallest difference.
 */
public class SmallestNeighborDistance {
    public static int findSmallestDistanceIndex(int[] arr) {
        if (arr.length < 2) {
            return -1; // Not enough elements
        }

        int minIndex = 0;
        int minDiff = Math.abs(arr[1] - arr[0]);

        for (int i = 1; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        return minIndex;
    }
}
