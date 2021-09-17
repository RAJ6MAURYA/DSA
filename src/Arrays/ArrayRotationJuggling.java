package Arrays;

// a program to rotate the array by d positoin using GCD method
// import java.util.*;

public class ArrayRotationJuggling {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int d = 12;
        int n = a.length;
        System.out.println("Length of the array is:" + n);
        rotateJuggling(a, n, d);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    static void rotateJuggling(int a[], int n, int d) {
        int g = GCD(n, d);
        for (int i = 0; i < g; i++) {
            int j = i;
            int temp = a[i];
            while (true) {
                int k = (j + d) % n;
                if (k == i) {
                    a[j] = temp;
                    break;
                } else {
                    a[j] = a[k];
                    j = k;
                }

            }
        }
    }

    static int GCD(int n, int d) {
        int gcd = 0;
        for (int i = 1; i <= d && i < n; i++) {
            if (n % i == 0 && d % i == 0)
                gcd = i;
        }
        System.out.println("GCD:" + gcd);
        return gcd;
    }
}