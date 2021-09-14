package codePtit;

import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private long nhap;
        private long xuat;
        private long dongia;
        private long tien;
        private long thue;

        public sv(){}

        public void nhap(Scanner s) {
            ma = s.next();
            nhap = s.nextLong();
        }

        public String getMa(){return ma;}
        public void setXuat(){
            if (ma.startsWith("A"))
                xuat = Math.round(nhap*(60.0/100.0));
            else if(ma.startsWith("B"))
                xuat = Math.round(nhap*(70.0/100.0));
        }
        public long getNhap(){return nhap;}
        public long getXuat(){return xuat;}
        public void setDongia(){
            if(ma.endsWith("Y"))
                dongia = 110000;
            else if (ma.endsWith("N"))
                dongia = 135000;
        }
        public long getDongia(){return dongia;}
        public void setTien(){
            tien = xuat*dongia;
        }
        public long getTien(){return tien;}
        public void setThue(){
            if(ma.startsWith("A") && ma.endsWith("Y")){
                thue = (long)(tien*(8.0/100.0));
            }else if(ma.startsWith("A") && ma.endsWith("N")){
                thue = (long)(tien*(11.0/100.0));
            }else if(ma.startsWith("B") && ma.endsWith("Y")){
                thue = (long)(tien*(17.0/100.0));
            }else if(ma.startsWith("B") && ma.endsWith("N")){
                thue = (long)(tien*(22.0/100.0));
            }
        }
        public long getThue(){return thue;}

        public void xuat(){
            System.out.println(
                    this.getMa()+" "+this.getNhap()+" "+this.getXuat()+" "+this.getDongia()
                    +" "+this.getTien()+" "+this.getThue()
            );
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> res = new ArrayList<>();
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            i.setXuat();
            i.setDongia();
            i.setTien();
            i.setThue();
            res.add(i);
        }
        for (sv i :res){
            i.xuat();
        }
    }
}
