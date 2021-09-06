package codePtit;

import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private float so1;
        private float so2;
        private float tong;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            so1 = s.nextFloat();
            so2 = s.nextFloat();
        }

        public void setMa(int i){
            ma = (i<10) ? "KH0"+i : "KH"+i ;
        }
        public String getMa(){return ma;}

        public String getName(){return name;}

        public void setTong(){
           float hieu = so2 - so1;
           if (hieu <= 50)
               tong = hieu*100 + hieu*100*2/100;
           else if (hieu >= 51 && hieu <= 100){
               float cs2 = hieu-50;
               tong = 50*100 + cs2*150;
               tong += tong*3/100;
           }else{
              float cs2 = hieu-100;
              tong = 50*100 + 50*150 + cs2*200;
              tong += tong*5/100;
           }
        }

        public String getTongAsString(){
            return  String.format("%.0f",tong);
        }
        public float getTongAsFloat(){
            return tong;
        }

        public void xuat(){
            System.out.println(
                    this.getMa()+" "+this.getName()+" "+this.getTongAsString()
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
            i.setTong();
            res.add(i);
            a++;
        }
        Collections.sort(res, new Comparator<sv>() {
            @Override
            public int compare(sv o1, sv o2) {
                return o1.getTongAsFloat()>o2.getTongAsFloat()?-1:1;
            }
        });
        for(sv i :res){
            i.xuat();
        }
    }
}
