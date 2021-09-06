package codePtit;

import java.util.*;

public class Test {
    static class ts{
        private String name;
        private String birth;
        private float d1;
        private float d2;
        private float d3;

        public ts(){ }
        public void nhap(){
            Scanner s = new Scanner(System.in);
            name = s.nextLine();
            birth = s.nextLine();
            d1 = s.nextFloat();
            d2 = s.nextFloat();
            d3 = s.nextFloat();
        }
        public void xuat() {
          double tong = d1+d2+d3;
          String res = String .format("%.1f",tong);
          System.out.println(name+" "+birth+" "+res);
        }
    }
    public static void main(String[] args) {
        ts a = new ts();
        a.nhap();
        a.xuat();
    }
}
