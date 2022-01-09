package codePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String ten;
        private int tinchi;
        private String lith;
        private String thchanh;

        public sv(){}

        public void setMa(String ma){
            this.ma = ma;
        }

        public String getMa(){return ma;}

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public int getTinchi() {
            return tinchi;
        }

        public void setTinchi(int tinchi) {
            this.tinchi = tinchi;
        }

        public void xuat(){
            System.out.println(ma+" "+ten+" "+tinchi+" "+lith+" "+thchanh);
        }

        public String getLith() {
            return lith;
        }

        public void setLith(String lith) {
            this.lith = lith;
        }

        public String getThchanh() {
            return thchanh;
        }

        public void setThchanh(String thchanh) {
            this.thchanh = thchanh;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("MONHOC.in"));
        int c = 1;
        sv a = null;
        List<sv> res = new ArrayList<>();
        Integer t = Integer.valueOf(s.nextLine());
        while (s.hasNextLine()){
            if (c ==1) {
                a = new sv();
                a.setMa(s.nextLine());
                c++;
            }else if (c == 2){
                a.setTen(s.nextLine());
                c++;
            }else if (c == 3){
                a.setTinchi(Integer.valueOf(s.nextLine()));
                c++;
            }
            else if (c == 4){
                a.setLith(s.nextLine());
                c++;
            }
            else if (c == 5){
                a.setThchanh(s.nextLine());
                c=1;
                res.add(a);
            }
        }
        Collections.sort(res,Comparator.comparing(sv::getMa));
        for (sv i : res)
        {
            if (!i.getThchanh().equals("Truc tiep"))
                i.xuat();
        }
    }
}