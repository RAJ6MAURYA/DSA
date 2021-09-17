package Arrays;
// Search an element in a Sorted and Rotated Array who's pivot is not knows beforehand

public class SortedRotatedSearch {
    public static void main(String args[]) {
        int a[] = { 3, 4, 5, 6, 7, 8, 9, 1, 2 };
        int key = 8;
        int pivot = searchPivot(a);
        binarySearch(a, pivot, key);

    }

    static int searchPivot(int[] a) { // method to find the pivot of the array{3, 4, 5, 1, 2}: Pivot =5;
        int pivot = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i + 1] < a[i]) {
                pivot = i;
                break;
            }
        }
        return pivot;
    }

    static void binarySearch(int a[], int pivot, int key) { // method to find the key element
        int start = 0;
        int end = a.length - 1;
        int mid = pivot;
        if (key > a[0]) {
            end = mid;
            mid = (start + end) / 2;
        } else {
            start = mid + 1;
            mid = (start + end) / 2;
        }
        while (start < end) {
            if (a[mid] == key) {
                System.out.println("Key is found at index:" + mid);
                System.exit(0);
            } else if (key < mid) {
                end = mid;
                mid = (end + start) / 2;
            } else {
                start = mid;
                mid = (end + start) / 2;
            }

        }
        System.out.println("Key is not found:");

    }
}
