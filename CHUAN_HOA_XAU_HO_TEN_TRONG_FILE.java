package codePtit;

import java.io.*;
import java.text.NumberFormat;
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
       Scanner s = new Scanner(new File("DATA.in"));
       while (s.hasNextLine()){
           String  a = s.nextLine();
           if (a.equals("END"))
               break;
           else{
               a = a.trim();
               String b[] = a.split("\\s+");
               for (int i = 0;i<b.length;i++){
                   b[i] = Character.toUpperCase(b[i].charAt(0))+b[i].substring(1).toLowerCase();
               }
               System.out.println(String.join(" ",b));
           }
       }

    }
}