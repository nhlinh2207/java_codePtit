package codePtit;

import java.util.*;

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
        int d = 1;
        while (n > 0){
            Long c = s.nextLong();
            List<Long> a = new ArrayList<>();
            while (c % 2 ==0){
                c/=2;
                a.add(Long.valueOf(2));
            }
            for(long i = 3;i<=c;i+=2){
                while(c%i==0){
                    c/=i;
                    a.add(i);
                }
            }
            a.stream().sorted();
            Set<Long> set = new LinkedHashSet<>(a);

            System.out.print("Test "+d+": ");
            for (Long i: set){
                System.out.print(
                        i+"("+Collections.frequency(a,i)+") "
                );
            }
            System.out.println();
            d++;
            n--;
        }
    }
}