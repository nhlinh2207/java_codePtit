package codePtit;

import java.util.*;
class PhanSo{
    private long ts;
    private long ms;
    public PhanSo(long a, long b){
        ts = a;
        ms = b;
    }

    public void rutgon() {
        if (ts != 1) {
            if (ms % ts == 0) {
                ms = ms / ts;
                ts = 1;
            } else {
                long t1 = ts;
                long t2 = ms;
                while (t1 != t2) {
                    if (t1 < t2) t2 -= t1;
                    else t1 -= t2;
                }
                ts /= t1;
                ms /= t1;
            }
        }
    }
    public void xuat(){
        System.out.println(ts+"/"+ms);
    }
}
public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        long c = s.nextLong();
        long d = s.nextLong();
        PhanSo p1 = new PhanSo(a*d+b*c,b*d);
        p1.rutgon();
        p1.xuat();
    }
}

