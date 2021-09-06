package codePtit;

import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private float d1;
        private float d2;
        private float tb;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            d1 = s.nextFloat();
            d2 = s.nextFloat();
        }

        public void setMa(int i){
            ma = (i<10) ? "TS0"+i : "TS"+i ;
        }
        public String getMa(){return ma;}
        public String getName(){return name;}
        public void setTb(){
            if(d1 > 10) d1 = d1/10;
            if (d2 > 10) d2 = d2/10;
            tb = (d1+d2)/2;
        }
        public String getTb(){
            return String.format("%.2f",tb);
        }
        public float getdiemTb(){
            return tb;
        }
        public String getLoai(){
            if(tb < 5.0) return "TRUOT";
            else if(tb>5.0 && tb<8.0) return "CAN NHAC";
            else if(tb>=8.0 && tb <=9.5) return "DAT";
            else return "XUAT SAC";
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
            i.setTb();
            res.add(i);
            a++;
        }
        Collections.sort(res, new Comparator<sv>() {
            @Override
            public int compare(sv o1, sv o2) {
               return o1.getdiemTb() > o2.getdiemTb() ? -1:1;
            }
        });
        for(sv i :res){
            System.out.println(
                    i.getMa()+" "+i.getName()+" "+i.getTb()+" "+i.getLoai()
            );
        }
    }
}
