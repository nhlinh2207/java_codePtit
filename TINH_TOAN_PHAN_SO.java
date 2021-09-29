package codePtit;

import java.util.Scanner;

public class Test {
    static class Phan_so{
        private long ts_1;
        private long ms_1;
        private long ts_2;
        private long ms_2;

        public Phan_so(){

        }

        public Phan_so(long ts_1, long ms_1, long ts_2, long ms_2){
            this.ts_1=ts_1;
            this.ms_1=ms_1;
            this.ts_2=ts_2;
            this.ms_2=ms_2;
        }

        public long getGcd(long a, long b) {
            while (b!=0){
                long tmp=a%b;
                a=b;
                b=tmp;
            }
            return a;
        }

        public String getC(){
            long x1=ts_1/getGcd(ts_1, ms_1)*ms_2/getGcd(ts_2, ms_2);
            long x2=ts_2/getGcd(ts_2, ms_2)*ms_1/getGcd(ts_1, ms_1);
            long y=ms_1/getGcd(ts_1, ms_1)*ms_2/getGcd(ts_2, ms_2);
            long gcd=getGcd((x1+x2), y);
            long ts=((x1+x2)/gcd)*((x1+x2)/gcd), ms=(y/gcd)*(y/gcd);
            return ts+"/"+ms;
        }

        public String getD(){
            String st[]=getC().split("/");
            long x=Long.parseLong(st[0]);
            long y=Integer.parseInt(st[1]);
            long ts=ts_1/getGcd(ts_1, ms_1)*ts_2/getGcd(ts_2, ms_2)*x;
            long ms=ms_1/getGcd(ts_1, ms_1)*ms_2/getGcd(ts_2, ms_2)*y;
            long gcd=getGcd(ts, ms);
            return ts/gcd+"/"+ms/gcd;
        }
        public String toString(){
            return getC()+" "+getD();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            Phan_so ps=new Phan_so(sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong());
            System.out.println(ps.toString());
        }
    }
}