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
       List<String> a = new ArrayList<>();
       while (s.hasNext()){
           a.add(s.next());
       }
       List<String> res = new ArrayList<>();
       for (String i: a){
           try{
               int b = Integer.valueOf(i);
           }catch(NumberFormatException e){
               res.add(i);
           }
       }
       Collections.sort(res);
       for (String i : res){
           System.out.print(i+" ");
       }
    }
}