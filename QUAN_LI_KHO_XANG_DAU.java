package codePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private long soluong;
        private long dongia;
        private double thue;
        private String tenhang;
        private long thanhtien;

        public sv(){}

        public void nhap(Scanner s){
            ma = s.next();
            soluong = s.nextLong();
        }

        public void setDongia(){
            char t = ma.charAt(0);
            if (t == 'X') {
                dongia = 128000;
                thue = 3;
            }
            else if (t == 'D') {
                dongia = 11200;
                thue = 3.5;
            }
            else{
                dongia = 9700;
                thue = 2;
            }
        }

        public void setTenhang(){
            String t = ma.substring(ma.length()-2);
            if (t.equals("BP"))
                tenhang = "British Petro";
            else if (t.equals("ES"))
                tenhang = "Esso";
            else if (t.equals("SH"))
                tenhang = "Shell";
            else if (t.equals("CA"))
                tenhang = "Castrol";
            else if (t.equals("MO"))
                tenhang = "Mobil";
            else{
                tenhang = "Trong Nuoc";
                thue = 0;
            }
        }

        public void setThanhtien(){
            thanhtien = dongia*soluong + Math.round(dongia*soluong*(thue/100));
        }

        public long getthue(){
            return Math.round(dongia*soluong*(thue/100));
        }

        public void xuat(){
            System.out.println(ma+" "+tenhang+" "+dongia+" "+getthue()+" "+thanhtien);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        List<sv> res = new ArrayList<>();
        int t = s.nextInt();
        while (t-->0){
            sv a = new sv();
            a.nhap(s);
            a.setDongia();
            a.setTenhang();
            a.setThanhtien();
            res.add(a);
        }
        for (sv i : res)
            i.xuat();
    }
}