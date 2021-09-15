package codePtit;

import java.io.DataInput;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String donvi;
        private long dongia;
        private long soluong;
        private long phivanchuyen;
        private long thanhtien;
        private long giaban;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            donvi = s.next();
            dongia = s.nextLong();
            soluong = s.nextLong();
        }

        public void setPhivanchuyen(){
            phivanchuyen = Math.round(5.0/100*dongia*soluong);
        }

        public void setThanhtien(){
            thanhtien = soluong*dongia+phivanchuyen;
        }

        public void setMa(int a){
            ma = (a < 10) ? "MH0"+a :"MH"+a ;
        }

        public void setGiaban(){
            double temp = thanhtien + 2.0/100*thanhtien;
            temp /= soluong;
            temp /= 100;
            giaban = (long)Math.ceil(temp)*100;
        }
        public long getGiaban(){return giaban;}

        public void in(){
            System.out.println(
                    this.ma+" "+this.name+" "+this.donvi+" "+this.phivanchuyen+" "+this.thanhtien+" "+this.giaban
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
            i.setPhivanchuyen();
            i.setThanhtien();
            i.setGiaban();
            res.add(i);
        }
        Collections.sort(res, Comparator.comparing(sv::getGiaban,Comparator.reverseOrder()));
        for(sv i :res){
            i.in();
        }
    }
}
