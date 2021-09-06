package codePtit;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        if (a.isEmpty() == true) a = "0";
        if (b.isEmpty() == true) b = "0";
        int i = 0;
        while (a.charAt(i) == '0') {
            i++;
            if (i >= a.length())
                break;
        }
        if (i >= a.length()) a = "0";
        else a = a.substring(i, a.length());
        i = 0;
        while (b.charAt(i) == '0'){
            i++;
            if(i>=b.length())
                break;
        }
        if(i >= b.length()) b="0";
        else b = b.substring(i,b.length());
        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);
        System.out.println(big1.subtract(big2));
    }
}
