package codePtit;
import java.math.BigInteger;
import java.util.*;

public class Test {
    static BigInteger gcd(BigInteger t1, BigInteger t2){
        if (t1.toString().equals("0"))
            return t2;
        return gcd(t2.mod(t1), t1);
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int p = s.nextInt();
       while(p-->0){
           String a = s.next();
           String b = s.next();
           BigInteger t1 = new BigInteger(a);
           BigInteger t2 = new BigInteger(b);
           BigInteger res = (t1.multiply(t2)).divide(gcd(t1,t2));
           System.out.println(res);
       }
    }
}