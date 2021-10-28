package codePtit;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class Pair {
        private int a;
        private int b;

        public Pair(int x, int y) {
            a = x;
            b = y;
        }

        public boolean check(int n) {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }

        public boolean isPrime() {
            if (check(a) && check(b))
                return true;
            return false;
        }

        @Override
        public String toString() {
            return a+" "+b;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair p = new Pair(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check) System.out.println(-1);
        }
    }
}