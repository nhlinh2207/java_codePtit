package codePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String ten;
        private String cv;
        private String hieuso;
        private String baclg;

        public sv(){}

        public void nhap(Scanner s){
            ma = s.nextLine();
            String temp[] = ma.split(" ");
            ma = temp[0];
            ten = temp[1];
            for (int i = 2;i<temp.length;i++){
                ten += " "+temp[i];
            }
        }

        public void setCv(String a){
            cv = a;
        }

        public String getCv(){return cv;}

        public void setBaclg(){
            baclg = ma.substring(2,4);
        }
        public void setHieuso(){
            hieuso = ma.substring(4);
        }

        public void xuat(){
            System.out.println(ten+" "+cv+" "+hieuso+" "+baclg);
        }

        public String getMa(){return ma;}

        public int getsh(){
            return Integer.valueOf(hieuso);
        }

        public int getbl(){
            return Integer.valueOf(baclg);
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       s.nextLine();
       int gd = 0, tp = 0, pp = 0;
       List<sv> res = new ArrayList<>();
       while(n-->0){
           sv a = new sv();
           a.nhap(s);
           a.setBaclg();
           a.setHieuso();
           if (a.getMa().substring(0,2).equals("GD")){
             if (tp < 3){
                 a.setCv("GD");
                 gd++;
             }else{
                 a.setCv("NV");
             }
           }else if (a.getMa().substring(0,2).equals("TP")){
               if (tp < 3){
                   a.setCv("TP");
                   tp++;
               }else{
                   a.setCv("NV");
               }
           }else if(a.getMa().substring(0,2).equals("PP")){
               if (pp < 3){
                   a.setCv("PP");
                   pp++;
               }else{
                   a.setCv("NV");
               }
           }else{
               a.setCv("NV");
           }
           res.add(a);
       }
       Collections.sort(res, Comparator.comparing(sv::getsh));
       Collections.sort(res, Comparator.comparing(sv::getbl, Comparator.reverseOrder()));
       int p = s.nextInt();
       while (p-- > 0){
           String k = s.next();
           for (sv i: res){
               if (i.getCv().equals(k))
                   i.xuat();
           }
           System.out.println();
       }
    }
}