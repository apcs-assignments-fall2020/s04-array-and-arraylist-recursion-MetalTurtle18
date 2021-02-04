import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, list.size() - 1);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        return i == 0 || (list.get(i - 1) <= list.get(i) && isSortedRec(list, --i));
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, arr.length - 1);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        return i == 0 ? ((arr[i] == x ? 1 : 0) == count) : (hasCountCopiesRec(arr, x, count - (arr[i] == x ? 1 : 0), --i));
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length - 1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        int middleIndex = lowerBound + (upperBound - lowerBound) / 2;
        if (lowerBound > upperBound) return false;
        if (arr[middleIndex] > num) return binarySearchRec(arr, num, lowerBound, middleIndex - 1);
        if (arr[middleIndex] < num) return binarySearchRec(arr, num, middleIndex + 1, upperBound);
        return true;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
