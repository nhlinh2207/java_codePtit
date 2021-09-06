package codePtit;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static void in(int n, int h){
        for(int i = 1;i<n;i++)
             System.out.printf("%.6f ", Math.sqrt(i / (n * 1.0)) * h);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        while(n-- > 0) {
            int num = s.nextInt();
            int h = s.nextInt();
            in(num,h);
            System.out.println();
        }
    }
}
