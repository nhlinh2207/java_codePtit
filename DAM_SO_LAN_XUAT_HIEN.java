package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int k = 1;
        while (n > 0){
            int size = s.nextInt();
            Long a[] = new Long[size];
            for (int i = 0;i<size ;i++)
                a[i] = s.nextLong();
            List<Long> b = new ArrayList<>(Arrays.asList(a));
            Set<Long> set = new LinkedHashSet<>(b);
            System.out.println("Test "+k+":");
            for (Long i: set){
                System.out.println(
                    i+" xuat hien "+Collections.frequency(b,i)+" lan"
                );
            }
            k++;
            n--;
        }
    }
}
