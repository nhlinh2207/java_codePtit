package codePtit;

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
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        sv a = new sv();
        a.nhap(s);
        a.setPc();
        a.setTonguong();
        a.xuat();
    }
}