package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();

        int cd1 = Math.abs(x2-x1);
        int cr1 = Math.abs(y2-y1);
        a.add(cd1); a.add(cr1);

        int z1 = s.nextInt();
        int t1 = s.nextInt();
        int z2 = s.nextInt();
        int t2 = s.nextInt();

        int cd2 = Math.abs(z2-z1);
        int cr2 = Math.abs(t2-t1);
        a.add(cd2); a.add(cr2);

        int c1 = Math.abs(x2 - z1) > Math.abs(z2 - x1) ? Math.abs(x2 - z1) : Math.abs(z2 - x1);
        int c2 = Math.abs(t2 - y1) > Math.abs(y2 - t1) ? Math.abs(t2 - y1) : Math.abs(y2 - t1);

        int c = c1>=c2 ? c1: c2;
        int m = a.stream().max(Comparator.comparing(Integer::intValue)).get();
        if (c <= m)
            System.out.println(m*m);
        else
            System.out.println(c*c);
    }
}