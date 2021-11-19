package codePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String ten;
        private String lop;
        private String email;

        public sv(){}

        public void setMa(String ma){
            this.ma = ma;
        }

        public String getMa(){return ma;}

        public String getTen() {
            ten = ten.trim();
            String t[] = ten.split("\\s+");
            for (int i = 0;i<t.length; i++){
                t[i] = Character.toUpperCase(t[i].charAt(0))+t[i].substring(1).toLowerCase();
            }
            return String.join(" ",t);
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getLop() {
            return lop;
        }

        public void setLop(String lop) {
            this.lop = lop;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void xuat(){
            System.out.println(ma+" "+getTen()+" "+lop+" "+email);
        }
    }

    static class mh{
        private String ma;
        private String ten;
        private int tinchi;

        public mh(){}

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
            System.out.println(ma+" "+ten+" "+tinchi);
        }
    }
    static class Bd{
        private String mamon;
        private String masv;
        private String diem;

        public Bd(){}

        public String getMamon() {
            return mamon;
        }

        public void setMamon(String mamon) {
            this.mamon = mamon;
        }

        public String getMasv() {
            return masv;
        }

        public void setMasv(String masv) {
            this.masv = masv;
        }

        public String getDiem() {
            return diem;
        }

        public void setDiem(String diem) {
            this.diem = diem;
        }
    }
    static class kq{
        private String masv, tensv, lop, diem;

        public String getMasv() {
            return masv;
        }

        public void setMasv(String masv) {
            this.masv = masv;
        }

        public String getTensv() {
            return tensv;
        }

        public void setTensv(String tensv) {
            this.tensv = tensv;
        }

        public String getLop() {
            return lop;
        }

        public void setLop(String lop) {
            this.lop = lop;
        }

        public String getDiem() {
            return diem;
        }

        public void setDiem(String diem) {
            this.diem = diem;
        }
        public float getdiemfloat(){
            return Float.valueOf(diem);
        }

        public void xuat(){
            System.out.println(masv+" "+tensv+" "+lop+" "+diem);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("SINHVIEN.in"));
        int c = 1;
        s.nextLine();
        sv a = null;
        List<sv> res1 = new ArrayList<>();
        while (s.hasNextLine()){
            if (c ==1) {
                a = new sv();
                a.setMa(s.nextLine());
                c++;
            }else if (c == 2){
                a.setTen(s.nextLine());
                c++;
            }else if (c == 3){
                a.setLop(s.nextLine());
                c++;
            }else if (c == 4){
                a.setEmail(s.nextLine());
                c = 1;
                res1.add(a);
            }
        }
        s = new Scanner(new File("MONHOC.in"));
        int d = 1;
        s.nextLine();
        mh b = null;
        List<mh> res2 = new ArrayList<>();
        while (s.hasNextLine()){
            if (d == 1) {
                b = new mh();
                b.setMa(s.nextLine());
                d++;
            }else if (d == 2){
                b.setTen(s.nextLine());
                d++;
            }else if (d == 3){
                b.setTinchi(Integer.valueOf(s.nextLine()));
                d=1;
                res2.add(b);
            }
        }
        s = new Scanner(new File("BANGDIEM.in"));
        int e = Integer.valueOf(s.nextLine());
        List<Bd> res3 = new ArrayList<>();
        for (int i = 0 ;i< e; i++){
            String temp = s.nextLine();
            Bd t = new Bd();
            String item[] = temp.split(" ");
            t.setMasv(item[0]);
            t.setMamon(item[1]);
            t.setDiem(item[2]);
            res3.add(t);
        }
        List<kq> ketqua = new ArrayList<>();
        e = Integer.valueOf(s.nextLine());
        for (int i = 0;i<e; i++){
            String mamon = s.nextLine();
            for (mh P :res2) {
                if (P.getMa().equals(mamon)) {
                    System.out.println("BANG DIEM MON " + P.getTen() + ": ");
                    for (Bd j : res3){
                        if (j.getMamon().equals(mamon)){
                            kq h = new kq();
                            h.setDiem(j.getDiem());
                            for (sv k: res1){
                                if (k.getMa().equals(j.getMasv())){
                                    h.setMasv(k.getMa());
                                    h.setLop(k.getLop());
                                    h.setTensv(k.getTen());
                                    break;
                                }
                            }
                            ketqua.add(h);
                        }
                    }
                    Collections.sort(ketqua,Comparator.comparing(kq::getMasv));
                    Collections.sort(ketqua, Comparator.comparing(kq::getdiemfloat, Comparator.reverseOrder()));

                    for (kq L: ketqua){
                        L.xuat();
                    }
                    ketqua = new ArrayList<>();
                }
            }
        }
    }
}