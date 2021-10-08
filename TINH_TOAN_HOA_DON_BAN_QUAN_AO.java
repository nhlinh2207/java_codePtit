package codePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String ten;
        private long gia1;
        private long gia2;
        private long gg;
        private long tt;


        public sv(){}

        public void nhap(Scanner s){
            ma = s.next();
            s.nextLine();
            ten = s.nextLine();
            gia1 = s.nextLong();
            gia2 = s.nextLong();
        }

        public void setMa(String a, int b){
            ma = a+"-";
            if (b < 10){
                ma += "00"+b;
            }else if (b >= 10 && b<100){
                ma += "0"+b;
            }else ma += b;
        }

        public void setGg(int loai, int soluong){
            long total = (loai == 1)? soluong*gia1: soluong*gia2;
            if (soluong >= 50 && soluong <100){
                gg = Math.round((15.0/100) * total);
                tt = total - gg;
            }else if (soluong >= 100 && soluong < 150){
                gg = Math.round((30.0/100) * total);
                tt = total - gg;
            }else if (soluong >= 150){
                gg = Math.round((50.0/100) * total);
                tt = total - gg;
            }else{
                gg = 0;
                tt = total;
            }
        }

        public void xuat(){
            System.out.println(ma+" "+ten+" "+gg+" "+tt);
        }
        public void setGia1(long g){
            gia1 = g;
        }
        public void setGia2(long g){
            gia2 = g;
        }
        public void setTen(String t){
            ten = t;
        }
        public long getGia1(){return gia1;}
        public long getGia2(){return gia2;}

        public String getMa(){return ma;}
        public String getTen(){return ten;}

    }
    public static void main(String[] args) throws FileNotFoundException {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int gd = 0, tp = 0, pp = 0;
       List<sv> res1 = new ArrayList<>();
       while(n-->0){
           sv a = new sv();
           a.nhap(s);
           res1.add(a);
       }
       List<sv> res2 = new ArrayList<>();
       int p = s.nextInt();
        int c = 1;
       while (p-- > 0){
           String a = s.next();
           int soluong = s.nextInt();
           int loai = Integer.valueOf(a.substring(2));
           for (sv i : res1){
               if (i.getMa().equals(a.substring(0,2))){
                   sv temp = new sv();
                   temp.setGia1(i.getGia1());
                   temp.setGia2(i.getGia2());
                   temp.setMa(a, c);
                   temp.setTen(i.getTen());
                   temp.setGg(loai, soluong);
                   res2.add(temp);
               }
           }
           c++;
       }
        for (sv i :res2){
            i.xuat();
        }
    }
}