package codePtit;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0) {
            String a = s.next();
            String b = s.next();
            if (a.isEmpty() == true) a = "0";
            if (b.isEmpty() == true) b = "0";
            int t = (a.length()>b.length()) ? a.length() :b.length();
            BigInteger big1 = new BigInteger(a);
            BigInteger big2 = new BigInteger(b);
            String res = big1.subtract(big2).toString();
            if(res.charAt(0) == '-')
                res = new StringBuilder(res).deleteCharAt(0).toString();
            if(res.length() < t){
                int m = res.length();
                for(int j = 0;j<t-m;j++){
                    res = "0"+res;
                }
            }
            System.out.println(res);
        }
    }
}
