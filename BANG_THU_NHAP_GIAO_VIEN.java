package codePtit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private long luongcb;
        private long pc;
        private long tonguong;

        public sv(){}

        public void nhap(Scanner s){
            ma = s.next();
            s.nextLine();
            name = s.nextLine();
            luongcb = s.nextLong();
        }

        public void setPc(){
            String t = ma.substring(0,2);
            if (t.equals("HT"))
                pc = 2000000;
            else if (t.equals("HP"))
                pc = 900000;
            else pc = 500000;
        }

        public void setTonguong(){
            int a = Integer.valueOf(ma.substring(2));
            tonguong = luongcb*a + pc;
        }

        public void xuat(){
            System.out.println(ma+" "+name+" "+Integer.valueOf(ma.substring(2))+" "+pc+" "+tonguong);
        }

        public String getMa(){
            return ma;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<sv> res = new ArrayList<>();
        int t = s.nextInt();
        int ht = 0, hp = 0;
        while (t-->0){
            sv a = new sv();
            a.nhap(s);
            a.setPc();
            a.setTonguong();
            if (a.getMa().substring(0,2).equals("HT")){
                ht++;
                if (ht == 1)
                    res.add(a);
            }
            else if (a.getMa().substring(0,2).equals("HP")){
                hp++;
                if (hp <=2)
                    res.add(a);
            }
            else
                res.add(a);
        }
        for (sv i : res){
            i.xuat();
        }
    }
}