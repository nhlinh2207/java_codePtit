package codePtit;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static long MOD = (long) (1e9 + 7);

    static long powerLL(long x, long n)
    {
        long result = 1;
        while (n > 0)
        {
            if (n % 2 == 1)
            {
                result = result * x % MOD;
            }
            n = n / 2;
            x = x * x % MOD;
        }
        return result;
    }

    static long powerStrings(String sa, String sb)
    {
        long a = 0, b = 0;

        for (int i = 0; i < sa.length(); i++)
        {
            a = (a * 10 + (sa.charAt(i) - '0')) % MOD;
        }

        for (int i = 0; i < sb.length(); i++)
        {
            b = (b * 10 + (sb.charAt(i) - '0')) %
                    (MOD - 1);
        }
        return powerLL(a, b);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            String a = s.next();
            String b =s.next();
            if(a.equals("0") && b.equals("0"))
                break;
            System.out.println(powerStrings(a,b));
        }
    }
}
