package codePtit;

import java.util.*;

public class Test {
    static class sv{
       private String ma;
       private long dongia;
       private long solg;
       private double thue;
       private double pvc;
       private double tongtien;

       public sv(){}

       public void nhap(Scanner s){
           ma = s.next();
           dongia = s.nextLong();
           solg = s.nextLong();
       }

       public void setThue(){
           if (ma.startsWith("T"))
               thue = 29.0/100 * (solg * dongia);
           else if (ma.startsWith("C")){
               thue = 10.0/100 * (dongia * solg);
           }else if (ma.startsWith("D")){
               thue = 8.0/100 * (dongia * solg);
           }else if (ma.startsWith("M"))
               thue = 2.0/100 * (dongia * solg);

           if (ma.endsWith("C"))
               thue = thue - 5.0/100*thue;
       }

       public void setPvc(){
           if (ma.startsWith("T"))
               pvc = 4.0/100 * (solg * dongia);
           else if (ma.startsWith("C")){
               pvc = 3.0/100 * (dongia * solg);
           }else if (ma.startsWith("D")){
               pvc = 2.5/100 * (dongia * solg);
           }else if (ma.startsWith("M"))
               pvc = 0.5/100 * (dongia * solg);
       }

       public void setTongtien(){
           tongtien = solg *dongia + thue + pvc;
           tongtien += 20.0/100*tongtien;
           tongtien /= solg;
       }

       public void xuat(){
           System.out.println(ma+" "+String.format("%.2f", tongtien));
       }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> temp = new ArrayList<>();
        while(n-->0){
            sv a= new sv();
            a.nhap(s);
            a.setThue();
            a.setPvc();
            a.setTongtien();
            temp.add(a);
        }
        for (sv i : temp)
            i.xuat();
    }
}