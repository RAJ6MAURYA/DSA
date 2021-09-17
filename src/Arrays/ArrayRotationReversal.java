
package Arrays;

public class ArrayRotationReversal {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 5;
        int n = a.length;
        rotateReversal(a, 0, d % n - 1);
        rotateReversal(a, d, n - 1);
        rotateReversal(a, 0, n - 1);
        display(a);
    }

    static void display(int a[]) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    static void rotateReversal(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            end--;
            start++;
        }
    }

}
