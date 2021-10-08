package codePtit;
import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String ten;
        private long slg;
        private long gia;

        public sv(){}

        public void nhap(Scanner s){
            ma = s.next();
            s.nextLine();
            ten = s.nextLine();
            slg = s.nextLong();
        }

        public void setTen(String a){
            ten = a;
        }

        public void setSlg(long a){
            slg = a;
        }

        public void setMa(String m){
            ma = m;
        }

        public void setGia(long a){
            gia = a*slg;
        }

        public void xuat(){
            System.out.println(ma+" "+ten+" "+gia);
        }
        public String getMa(){return ma;}
        public String getTen(){return ten;}
        public long getSlg(){return slg;}

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> res = new ArrayList<>();
        while(n-->0){
            sv a = new sv();
            a.nhap(s);
            res.add(a);
        }
        int p = s.nextInt();
        List<sv> f = new ArrayList<>();
        while (p-- > 0){
            String m = s.next();
            long g = s.nextLong();
            for (sv i :res){
                if (i.getMa().equals(m.substring(1,3))){
                    sv t = new sv();
                    t.setTen(i.getTen());
                    t.setSlg(i.getSlg());
                    t.setMa(m);
                    t.setGia(g);
                    f.add(t);
                }
            }
        }
        for (sv i: f){
            i.xuat();
        }
    }
}