package codePtit;

import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String mamon;
        private float d1;
        private float d2;
        private float tong;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            mamon = s.next();
            d1 = s.nextFloat();
            d2 = s.nextFloat();
        }

        public void setMa(int i){
            ma = (i<10)?  "GV0"+i :"GV"+i;
        }
        public String getMa(){return ma;}

        public String getName(){return name;}

        public void setTong(){
           float sum = d1*2+d2;
           int uutien = Integer.parseInt(Character.toString(mamon.charAt(1)));
           if(uutien == 1) sum+=2.0;
           if (uutien == 2) sum+=1.5;
           if (uutien == 3) sum += 1.0;
           tong = sum;
        }
        public String getTongAsString(){
            return String.format("%.1f",tong);
        }
        public float getTongAsFloat(){
            return tong;
        }

        public String getloai(){
            if(tong >= 18) return "TRUNG TUYEN";
            return "LOAI";
        }

        public String getMon(){
            String mon = Character.toString(mamon.charAt(0));
            if (mon.equals("A"))
                return "TOAN";
            if (mon.equals("B"))
                return "LY";
            return "HOA";
        }

        public void xuat(){
            System.out.println(
                    this.getMa()+" "+this.getName()+" "+this.getMon()+" "
                            +this.getTongAsString()+" "+this.getloai()
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
                return o1.getTongAsFloat() > o2.getTongAsFloat() ? -1:1;
            }
        });
        for(sv i :res){
            i.xuat();
        }
    }
}
