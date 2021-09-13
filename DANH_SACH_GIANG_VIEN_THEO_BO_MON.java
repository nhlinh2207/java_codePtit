package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String clas;

        public sv(){}

        public void nhap(Scanner s){
            name = s.nextLine();
            clas = s.nextLine();
        }
        public void setMa(int a){
            ma = a<10 ? "GV0"+a : "GV"+a ;
        }
        public String getMa(){return ma;}
        public String getClas(){
            String b[] = clas.split(" ");
            String res = "";
            for (String i : b){
                res += Character.toUpperCase(i.charAt(0));
            }
            return res;
        }
        public String getName(){return name;}
        public void xuat(){
            System.out.println(this.getMa()+" "+this.getName()+" "+this.getClas());
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        List<sv> res = new ArrayList<>();
        int c = 1;
        while(n-->0){
            sv a = new sv();
            a.nhap(s);
            a.setMa(c);
            res.add(a);
            c++;
        }
        int q = s.nextInt();
        s.nextLine();
        while(q-->0){
            String mon = s.nextLine();
            mon = mon.toUpperCase();
            String b[] = mon.split(" ");
            String cl = "";
            for(String i: b){
                cl += i.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+cl+":");
            for(sv i: res){
                if(i.getClas().equals(cl)){
                    i.xuat();
                }
            }
        }
    }
}