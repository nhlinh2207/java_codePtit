package codePtit;
import java.util.Scanner;

public class Test {
    static class sv{
        private String name;
        private long luongcb;
        private long ngaycong;
        private String chucvu;
        private long thuong;
        private long phucap;

        public sv(){}

        public void nhap(Scanner s){
            name = s.nextLine();
            luongcb = s.nextLong();
            ngaycong = s.nextLong();
            chucvu = s.next();
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
                    "NV01 "+name+" "+(ngaycong*luongcb)+" "+thuong+" "+phucap+" "+(ngaycong*luongcb+thuong+phucap)
            );
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        sv a = new sv();
        a.nhap(s);
        a.setThuong();
        a.setPhucap();
        a.xuat();
    }

}

