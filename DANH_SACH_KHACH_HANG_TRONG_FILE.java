package codePtit;

import java.io.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {

    static class sv{
        private String ma;
        private String ten;
        private String gt;
        private String ngs;
        private String dc;

        public sv(){}

        public String getMa() {
            return ma;
        }

        public void setMa(int a) {
            if (a < 10)
                ma = "KH00"+a;
            else{
                ma = "KH0"+a;
            }
        }

        public String getTen() {
           ten = ten.trim();
           String temp[] = ten.split("\\s+");
           for (int i = 0;i<temp.length; i++){
               temp[i] = Character.toUpperCase(temp[i].charAt(0))+temp[i].substring(1).toLowerCase();
           }
           return String.join(" ", temp);
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getGt() {
            return gt;
        }

        public void setGt(String gt) {
            this.gt = gt;
        }

        public String getNgs() {
            String temp[] = ngs.split("/");
            for (int i = 0; i< temp.length; i++){
                if (temp[i].length() == 1)
                    temp[i] = "0"+temp[i];
            }
            return String.join("/", temp);
        }

        public void setNgs(String ngs) {
            this.ngs = ngs;
        }

        public String getDc() {
            return dc;
        }

        public void setDc(String dc) {
            this.dc = dc;
        }

        public void xuat(){
            System.out.println(ma+" "+getTen()+" "+gt+" "+dc+" "+getNgs());
        }

        public Date gettuoi(){
            Date a = new Date();
            try{
                SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
                a = sf.parse(getNgs());
            }catch(Exception e){

            }
            return a;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
       Scanner s = new Scanner(new File("KHACHHANG.in"));
       String n = s.nextLine();
       List<sv> res = new ArrayList<>();
       sv b = new sv();
       int a = 1, c= 1;
       while(s.hasNextLine()){
           if (a == 1){
               b.setTen(s.nextLine());
               a++;
           }
           else if (a == 2){
               b.setGt(s.nextLine());
               a++;
           }
           else if (a == 3){
               b.setNgs(s.nextLine());
               a++;
           }
           else if (a == 4){
               a = 1;
               b.setDc(s.nextLine());
               b.setMa(c);
               c++;
               res.add(b);
               b = new sv();
           }
       }
       Collections.sort(res, Comparator.comparing(sv::gettuoi));
       for (sv i : res){
           i.xuat();
       }

    }
}