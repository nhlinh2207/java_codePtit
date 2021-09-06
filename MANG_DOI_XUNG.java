package codePtit;

import java.util.*;

public class Test {
    public static long fi (int n){
        long a = 1, b= 1;
        int m = 2;
        while(m != n){
            m++;
            long c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (n > 0){
            int size = s.nextInt();
            Long a[] = new Long[size];
            for (int i = 0;i<size ;i++)
                a[i] = s.nextLong();
            int l = 0, r = size-1;
            int c = 0;
            while(l<=r){
                if(a[l] != a[r]) {
                    c = 1;
                    break;
                }
                l++; r--;
            }
            if(c==0) System.out.println("YES");
            else System.out.println("NO");
            n--;
        }
    }
}
