package codePtit;

import java.util.Scanner;

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
            int c = s.nextInt();
            if(c==1 || c==2) System.out.println(1);
            else System.out.println(fi(c));
            n--;
        }
    }
}
