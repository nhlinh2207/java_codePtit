package codePtit;

import java.util.*;

public class Test {
    static class ts{
        private String name;
        private  String gioi;
        private String birth;
        private String diachi;
        private String ma;
        private String ngk;


        public ts(){ }
        public void nhap(){
            Scanner s = new Scanner(System.in);
            name = s.nextLine();
            gioi = s.nextLine();
            birth = s.nextLine();
            diachi = s.nextLine();
            ma = s.nextLine();
            ngk = s.nextLine();
        }
        public void xuat() {
          String b[] = birth.split("/");
          b[0] = (b[0].length() > 1)?b[0]:"0"+b[0];
          b[1] = (b[1].length() > 1)?b[1]:"0"+b[1];
          birth = String.join("/",b);

            String c[] = ngk.split("/");
            c[0] = (c[0].length() > 1)?c[0]:"0"+c[0];
            c[1] = (c[1].length() > 1)?c[1]:"0"+c[1];
            ngk = String.join("/",c);

          System.out.println("00001 "+name+" "+gioi+" "+birth+" "+diachi+" "
                  +ma+" "+ngk);
        }
    }
    public static void main(String[] args) {
        ts a = new ts();
        a.nhap();
        a.xuat();
    }
}
