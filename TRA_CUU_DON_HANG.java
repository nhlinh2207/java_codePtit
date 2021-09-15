package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String name;
        private String stt;
        private String ma;
        private long dongia;
        private long soluong;
        private long giamgia;
        private long thanhtien;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            ma = s.next();
            dongia = s.nextLong();
            soluong = s.nextLong();
        }

        private void setStt(){
            stt = ma.substring(1,ma.length()-1);
        }

        public void setGiamgia(){
            if(ma.charAt(ma.length()-1) == '2'){
                giamgia = Math.round(30.0/100*dongia*soluong);
            }
            else if(ma.charAt(ma.length()-1) == '1'){
                giamgia = Math.round(50.0/100*dongia*soluong);
            }
        }

        public void setThanhtien(){
            thanhtien  = dongia*soluong - giamgia;
        }

        public void in(){
            System.out.println(
                    this.name+" "+this.ma+" "+this.stt+" "+this.giamgia+" "+this.thanhtien
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
            i.setStt();
            i.setGiamgia();
            i.setThanhtien();
            res.add(i);
        }
        for(sv i :res){
            i.in();
        }
    }
}
