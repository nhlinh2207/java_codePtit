package codePtit;

import java.math.BigInteger;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t -- >0){
            String a = s.next();
            String b = s.next();
            BigInteger a1 = new BigInteger(a);
            BigInteger b1 = new BigInteger(b);
            if (a1.mod(b1).toString().equals("0") || b1.mod(a1).toString().equals("0"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}