package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-->0){
            long a = s.nextLong();
            long b= (long)Math.sqrt(a);
            if (b*b == a)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}