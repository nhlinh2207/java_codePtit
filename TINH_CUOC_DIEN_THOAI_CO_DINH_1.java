package codePtit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    static class sv{
        private int mavung;
        private String tinh;
        private long giacuoc;
        private String phone;
        private int sophut;
        private long tongtien;

        public sv(){}

        public sv(String a){
            tinh = a;
        }

        public void nhap(Scanner s){
            mavung = s.nextInt();
            s.nextLine();
            tinh = s.nextLine();
            giacuoc = s.nextLong();
        }

        public void xuat(){
            System.out.println(phone+" "+tinh+" "+sophut+" "+tongtien);
        }

        public int getMavung() {
            return mavung;
        }

        public void setMavung(int mavung) {
            this.mavung = mavung;
        }

        public String getTinh() {
            return tinh;
        }

        public void setTinh(String tinh) {
            this.tinh = tinh;
        }

        public long getGiacuoc() {
            return giacuoc;
        }

        public void setGiacuoc(long giacuoc) {
            this.giacuoc = giacuoc;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getSophut() {
            return sophut;
        }

        public void setSophut(String bd, String kt, int flag) {
            int hbd = Integer.valueOf(bd.split(":")[0]);
            int pbd = Integer.valueOf(bd.split(":")[1]);

            int hkt = Integer.valueOf(kt.split(":")[0]);
            int pkt = Integer.valueOf(kt.split(":")[1]);

            if (flag == 0) {
                sophut = (hkt * 60 + pkt) - (hbd * 60 + pbd);
            }else{
                sophut = (int)Math.ceil((float)((hkt * 60 + pkt) - (hbd * 60 + pbd))/3);
            }
        }

        public long getTongtien() {
            return tongtien;
        }

        public void setTongtien(int flag) {
            if (flag == 1){
                tongtien = sophut * 800;
            }else{
                tongtien = sophut * giacuoc;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> temp = new ArrayList<>();
        while(n-->0){
            sv a= new sv();
            a.nhap(s);
            temp.add(a);
        }
        int m = s.nextInt();
        List<sv> res = new ArrayList<>();
        while (m-->0){
            String phone = s.next();
            String bd = s.next();
            String kt = s.next();
            int c = 0;
            for (sv i :temp){
                if (Integer.toString(i.getMavung()).equals(phone.substring(1,3)) && phone.startsWith("0")){
                    sv newsv = new sv(i.getTinh());
                    newsv.setPhone(phone);
                    newsv.setGiacuoc(i.getGiacuoc());
                    newsv.setSophut(bd, kt, 0);
                    newsv.setTongtien(0);
                    res.add(newsv);
                    c++;
                    break;
                }
            }
            if (c == 0){
                sv newsv = new sv("Noi mang");
                newsv.setPhone(phone);
                newsv.setSophut(bd, kt, 1);
                newsv.setTongtien(1);
                res.add(newsv);
            }
        }
        for (sv i :res)
            i.xuat();
    }
}