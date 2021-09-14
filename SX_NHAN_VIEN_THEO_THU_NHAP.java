package codePtit;

import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String chucvu;
        private int luongcb;
        private int phucap;
        private int songaycong;
        private int luongchinh;
        private int tamung;

        public sv(){}

        public void nhap(Scanner s) {
            s.nextLine();
            name = s.nextLine();
            chucvu = s.next();
            luongcb = s.nextInt();
            songaycong = s.nextInt();
        }

        public void setMa(int a){ma = (a<10) ? "NV0"+a: "NV"+a;}
        public String getMa(){return ma;}
        public void setPhucap(){
            if(chucvu.equals("GD"))
                phucap = 500;
            else if(chucvu.equals("PGD"))
                phucap = 400;
            else if(chucvu.equals("TP"))
                phucap = 300;
            else if(chucvu.equals("KT"))
                phucap = 250;
            else phucap = 100;

        }
        public String getChucvu(){return chucvu;}
        public int getPhucap(){return phucap;}
        public String getName(){return name;}
        public void setLuongchinh(){
            luongchinh = songaycong*luongcb;
        }
        public int getThunhap(){
            return luongchinh+phucap;
        }
        public int getLuongchinh(){return luongchinh;}
        public void setTamung(){
            double temp = (phucap+luongchinh)*(2.0/3.0);
            if(temp < 25000){
                tamung = (int)Math.round(temp/1000)*1000;
            }else{
                tamung = 25000;
            }
        }
        public int getTamung(){return tamung;}

        public void xuat(){
            System.out.println(
                    this.getMa()+" "+this.getName()+" "+this.phucap+" "+this.luongchinh+" "+this.tamung
                    +" "+(this.luongchinh + this.phucap - this.tamung)
            );
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> res = new ArrayList<>();
        int a = 1;
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            i.setMa(a);
            a++;
            i.setPhucap();
            i.setLuongchinh();
            i.setTamung();
            res.add(i);
        }
        Collections.sort(res, Comparator.comparing(sv::getThunhap, Comparator.reverseOrder()));
        for (sv i :res){
            i.xuat();
        }
    }
}
