package codePtit;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            String a = s.next();
            String b = s.next();
            BigInteger big1 = new BigInteger(a);
            BigInteger big2 = new BigInteger(b);
            System.out.println(big2.add(big1));
        }
    }
}
