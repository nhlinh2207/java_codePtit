package code_ptit;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        long[] a = new long[100];
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i < 100; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }
        while (t-->0) {
            long n = sn.nextLong();
            if (check(a, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean check(long[] a, long n) {
        for (int i = 0; i < 100; i++) {
            if (n == a[i]) {
                return true;
            } else if (a[i] > n) {
                return false;
            }
        }
        return false;
    }
}