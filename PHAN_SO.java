package codePtit;

import java.util.*;
class PhanSo{
    private long ts;
    private long ms;
    public PhanSo(long a, long b){}
    public void  nhap(){
        Scanner s = new Scanner(System.in);
        ts = s.nextLong();
        ms = s.nextLong();
    }
    public void rutGon(){
        if (ts != 1) {
            if (ms % ts == 0) {
                ms = ms / ts;
                ts = 1;
            }else{
                long t1 = ts;
                long t2 = ms;
                while (t1 != t2){
                    if(t1<t2) t2-=t1;
                    else t1-=t2;
                }
                ts/=t1; ms/=t1;
            }
        }
    }

    @Override
    public String toString() {
        return ts+"/"+ms;
    }
}
public class Test {

    public static void main(String[] args) {
        PhanSo p = new PhanSo(1,1);
        p.nhap();
        p.rutGon();
        System.out.println(p);
    }
}


