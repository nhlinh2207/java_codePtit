package codePtit;

import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private int soluong;
        private long dongia;
        private long chieukhau;
        private long thanhtien;

        public sv(){}

        public void nhap(Scanner s) {
            s.nextLine();
            name = s.nextLine();
            soluong = s.nextInt();
            dongia = s.nextLong();
        }

        public String getTenma(){
            String b[] = name.split(" ");
            String tenma = "";
            tenma += Character.toUpperCase(b[0].charAt(0))+Character.toUpperCase(b[1].charAt(0));
            return tenma;
        }

        public void setMa(long a){
            String b[] = name.split(" ");
            String tenma = "";
            tenma += Character.toUpperCase(b[0].charAt(0));
            tenma += Character.toUpperCase(b[1].charAt(0));
            ma = (a<10) ? tenma+"0"+a: tenma+a;
        }
        public String getMa(){return ma;}
        public void setChieukhau(){
             if(soluong > 10){
                 chieukhau = (long)(soluong*dongia*(5.0/100.0));
             }else if(soluong >= 8 && soluong <= 10){
                 chieukhau = (long)(soluong*dongia*(2.0/100.0));
             }else if(soluong >= 5 && soluong < 8){
                 chieukhau = (long)(soluong*dongia*(1.0/100.0));
             }else{
                 chieukhau = 0;
             }
        }
        public long getChieukhau(){return chieukhau;}
        public void setThanhtien(){
            thanhtien = soluong*dongia - chieukhau;
        }
        public long getThanhtien(){
            return thanhtien;
        }
        public String getName(){return name;}

        public void xuat(){
            System.out.println(
                    this.getMa()+" "+this.getName()+" "+this.chieukhau+" "+this.thanhtien
            );
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> res = new ArrayList<>();
        List<String> ma = new ArrayList<>();
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            if (ma.contains(i.getTenma())){
                String temp = i.getTenma();
                i.setMa(ma.stream().filter(j -> j.equals(temp)).count()+1);
                ma.add(i.getTenma());
            }else{
                i.setMa(1);
                ma.add(i.getTenma());
            }
            i.setChieukhau();
            i.setThanhtien();
            res.add(i);
        }
        Collections.sort(res, Comparator.comparing(sv::getChieukhau, Comparator.reverseOrder()));
        for (sv i :res){
            i.xuat();
        }
    }
}
