package codePtit;

import java.io.*;
import java.util.*;

public class Test {

    static class sv{
        private String ma;
        private String ten;
        private String donvi;
        private long giaban;
        private long giamua;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            ten = s.nextLine();
            donvi = s.next();
            giamua = s.nextLong();
            giaban = s.nextLong();
        }

        public void setMa(int a){
            ma = (a < 10) ? "MH00"+a :"MH0"+a ;
        }
        public long gethieu(){
            return giaban - giamua;
        }

        public String getMa(){return ma;}

        public void xuat(){
            System.out.println(ma+" "+ten+" "+donvi+" "+giamua+" "+giaban+" "+gethieu());
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int a = 1;
       List<sv> res = new ArrayList<>();
       while (n-->0){
           sv i = new sv();
           i.setMa(a);
           i.nhap(s);
           res.add(i);
           a++;
       }
       Collections.sort(res, Comparator.comparing(sv::getMa));
       Collections.sort(res, Comparator.comparing(sv::gethieu, Comparator.reverseOrder()));
       for (sv i :res)
           i.xuat();
    }
}