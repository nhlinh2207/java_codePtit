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
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("SINHVIEN.in"));
        int c = 1;
        s.nextLine();
        sv a = null;
        List<sv> res = new ArrayList<>();
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
                res.add(a);
            }
        }
        Collections.sort(res,Comparator.comparing(sv::getMa));
        for (sv i : res)
            i.xuat();
    }
}