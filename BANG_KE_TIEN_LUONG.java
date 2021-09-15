package codePtit;

import org.w3c.dom.ls.LSOutput;

import java.io.DataInput;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private long luongcb;
        private long songaycong;
        private String chucvu;
        private long phucapchuvu;
        private long thuong;
        private long thuclinh;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            luongcb = s.nextLong();
            songaycong = s.nextLong();
            chucvu = s.next();
        }

        public void setThuong(){
            if (songaycong >= 25){
                thuong = Math.round(20.0/100*luongcb*songaycong);
            }else if(songaycong >= 22 && songaycong <25){
                thuong = Math.round(10.0/100*luongcb*songaycong);
            }else{
                thuong = 0;
            }
        }

        public void  setMa(int a){
            ma = a < 10 ?"NV0"+a :"NV"+a ;
        }

        public void setPhucapchuvu(){
            if (chucvu.equals("GD")){
                phucapchuvu = 250000;
            }else if(chucvu.equals("PGD")){
                phucapchuvu = 200000;
            }else if(chucvu.equals("TP")){
                phucapchuvu = 180000;
            }else{
                phucapchuvu = 150000;
            }
        }

        public void setThuclinh(){
            thuclinh = luongcb*songaycong+thuong+phucapchuvu;
        }

        public void in(){
            System.out.println(
                    this.ma+" "+this.name+" "+(this.songaycong*this.luongcb)
                            +" "+this.thuong+" "+this.phucapchuvu+" "+this.thuclinh
            );
        }

        public long getThuclinh(){return  thuclinh;}
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
            i.setPhucapchuvu();
            i.setThuong();
            i.setThuclinh();
            res.add(i);
        }
        for(sv i :res){
            i.in();
        }
        System.out.print("Tong chi phi tien luong: "+res.stream().mapToLong(i -> i.getThuclinh()).sum());
    }
}
