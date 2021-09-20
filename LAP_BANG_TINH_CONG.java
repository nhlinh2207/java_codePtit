package codePtit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private long luongcb;
        private long ngaycong;
        private String chucvu;
        private long thuong;
        private long phucap;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            luongcb = s.nextLong();
            ngaycong = s.nextLong();
            chucvu = s.next();
        }

        public void setma(int a){
            ma = (a< 10)? "NV0"+a : "NV"+a;
        }

        public void setThuong(){
            if (ngaycong >= 25)
                thuong = Math.round(20.0/100*ngaycong*luongcb);
            else if (ngaycong >= 22 && ngaycong < 25)
                thuong = Math.round(10.0/100*ngaycong*luongcb);
            else thuong = 0;
        }

        public void setPhucap(){
            if (chucvu.equals("GD"))
                phucap = 250000;
            else if (chucvu.equals("PGD"))
                phucap = 200000;
            else if (chucvu.equals("TP"))
                phucap = 180000;
            else phucap = 150000;
        }

        public void xuat(){
            System.out.println(
                    ma+" "+name+" "+(ngaycong*luongcb)+" "+thuong+" "+phucap+" "+(ngaycong*luongcb+thuong+phucap)
            );
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<sv> res = new ArrayList<>();
        int n  = s.nextInt();
        int c = 1;
        while (n-->0){
            sv a = new sv();
            a.nhap(s);
            a.setma(c);
            a.setThuong();
            a.setPhucap();
            res.add(a);
            c++;
        }
        for (sv i : res){
            i.xuat();
        }
    }

}

