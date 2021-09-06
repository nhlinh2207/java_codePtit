package codePtit;

import java.util.*;

public class Test {
    static class ts{
        private String name;
        private  String ma;
        private String birth;
        private float d1;

        public ts(){ }
        public void nhap(){
            Scanner s = new Scanner(System.in);
            name = s.nextLine();
            ma = s.nextLine();
            birth = s.nextLine();
            d1 = s.nextFloat();
        }
        public void xuat() {
          String b[] = birth.split("/");
          b[0] = (b[0].length() > 1)?b[0]:"0"+b[0];
          b[1] = (b[1].length() > 1)?b[1]:"0"+b[1];
          birth = String.join("/",b);
          String res = String .format("%.2f",d1);
          System.out.println("B20DCCN001 Nguyen Van A "+ma+" "+birth+" "+res);
        }
    }
    public static void main(String[] args) {
        ts a = new ts();
        a.nhap();
        a.xuat();
    }
}