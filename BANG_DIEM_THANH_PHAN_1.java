package codePtit;

import java.util.*;

public class Test {
    static class Sv{
        private String ma;
        private String ten;
        private String lop;
        private float d1;
        private float d2;
        private float d3;

        public Sv(){}

        public void nhap(Scanner s){
            ma = s.next();
            s.nextLine();
            ten = s.nextLine();
            lop = s.next();
            d1 = s.nextFloat();
            d2 = s.nextFloat();
            d3 = s.nextFloat();
        }

        public String getMa(){return ma;}

        public void xuat(){
            System.out.println(
                 this.ma+" "+this.ten+" "+this.lop+" "+String.format("%.1f", this.d1)+" "+String.format("%.1f", this.d2)+" "+String.format("%.1f", this.d3)
            );
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Sv> res=  new ArrayList<>();
        int c = 1;
        while(n-->0){
            Sv a = new Sv();
            a.nhap(s);;
            res.add(a);
        }
        Collections.sort(res, Comparator.comparing(Sv::getMa));
        for (Sv i: res){
            System.out.print(c+" ");
            i.xuat();
            c++;
        }
    }

}