package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        while(n>0) {
            String a = s.nextLine();
            int len = a.length();
            int i = 0;
            long h = 0;
            while (i < len) {
                h = ((h * 10) + (a.charAt(i) - '0')) % 11;
                i++;
            }
            if (h == 0) System.out.println("1");
            else System.out.println("0");
            n--;
        }
    }
}

