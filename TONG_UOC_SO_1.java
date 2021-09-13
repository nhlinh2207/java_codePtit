package codePtit;

import java.util.Scanner;

public class Test {

    public static long count = 0;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long[] TongUoc = new long[2000001];
        for (int i = 2; i <= 2000000; i++) {
            if (TongUoc[i] != 0) {
                continue;
            }
            for (int j = i; j <= 2000000; j += i) {
                int tmp = j;
                while (tmp % i == 0) {
                    TongUoc[j] += i;
                    tmp /= i;
                }
            }
        }
        int t;
        t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            count += TongUoc[a];
        }
        System.out.println(count);

    }

}