package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long c = 1,t = 1;
        for (long i = 2;i<=n;i++){
            t = t*i;
            c += t;
        }
        System.out.println(c);
    }
}