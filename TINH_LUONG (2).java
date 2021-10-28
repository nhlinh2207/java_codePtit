package codePtit;

import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String tenphong;
        private long luongcb;
        private int songcong;
        private int hsnhan;
        private long tongluong;

        public sv(){}

        public void nhap(Scanner s){
            ma = s.next();
            s.nextLine();
            name = s.nextLine();
            luongcb = s.nextLong();
            songcong = s.nextInt();
        }

        public void setHsnhan(){
            char a = ma.charAt(0);
            int kn = Integer.valueOf(ma.substring(1,3));
            if (a == 'A'){
                if (kn >=1 && kn <= 3)
                    hsnhan = 10;
                else if (kn >= 4 && kn <=8)
                    hsnhan = 12;
                else if (kn>=9 && kn <=16)
                    hsnhan = 14;
                else if (kn > 16)
                    hsnhan = 20;
            }else if (a == 'B'){
                if (kn >=1 && kn <= 3)
                    hsnhan = 10;
                else if (kn >= 4 && kn <=8)
                    hsnhan = 11;
                else if (kn>=9 && kn <=16)
                    hsnhan = 13;
                else if (kn > 16)
                    hsnhan = 16;
            }else if (a == 'C'){
                if (kn >=1 && kn <= 3)
                    hsnhan = 9;
                else if (kn >= 4 && kn <=8)
                    hsnhan = 10;
                else if (kn>=9 && kn <=16)
                    hsnhan = 12;
                else if (kn > 16)
                    hsnhan = 14;
            }else if (a == 'D'){
                if (kn >=1 && kn <= 3)
                    hsnhan = 8;
                else if (kn >= 4 && kn <=8)
                    hsnhan = 9;
                else if (kn>=9 && kn <=16)
                    hsnhan = 11;
                else if (kn > 16)
                    hsnhan = 13;
            }
        }

        public void setTongluong(){
            tongluong = luongcb*hsnhan*songcong*1000;
        }

        public void xuat(){
            System.out.println(ma+" "+name+" "+tenphong+" "+tongluong);
        }

        public void setTenphong(String a){
            tenphong = a;
        }

        public String getMa(){return ma;}
    }

    static class phong{
        private String ma;
        private String name;

        public phong(){}

        public void nhap(Scanner s){
            String temp = s.nextLine();
            String t[] = temp.split(" ");
            ma = t[0];
            name = t[1];
            for (int i = 2;i<t.length;i++)
                name+=" "+t[i];
        }

        public String getMa(){return ma;}
        public String getName(){return name;}
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        List<phong> p = new ArrayList<>();
        while(n-->0){
            phong a = new phong();
            a.nhap(s);
            p.add(a);
        }
        List<sv> res = new ArrayList<>();
        int m = s.nextInt();
        while(m-->0){
            sv a = new sv();
            a.nhap(s);
            a.setHsnhan();
            for (phong i : p){
                if (i.getMa().equals(a.getMa().substring(3))){
                    a.setTenphong(i.getName());
                }
            }
            a.setTongluong();
            res.add(a);
        }
        for (sv i :res){
            i.xuat();
        }
    }
}