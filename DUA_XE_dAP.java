package codePtit;

import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String place;
        private String time;
        private float vector;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            place = s.nextLine();
            time = s.next();
        }

        public void setMa(){
            ma = "";
            String tinh[] = place.split("\\s+");
            for (int i = 0;i<tinh.length;i++){
                ma += tinh[i].charAt(0);
            }
            String ten[] = name.split("\\s+");
            for (int i = 0;i<ten.length;i++) {
                ma += ten[i].charAt(0);
            }
        }
        public String getMa(){return ma;}

        public String getName(){return name;}

        public String getPlace(){return place;}

        public void setVector(){
            String t[] = time.split(":");
            float h = Float.parseFloat(t[0]);
            float m = Float.parseFloat(t[1]);
            float gio = (h-6) + (m/60);
            vector = 120/gio;
        }
        public float getVectorAsLong(){
            return vector;
        }
        public String getVectorAsString(){
            return String.format("%.0f",vector)+" Km/h";
        }

        public void xuat(){
            System.out.println(
                    this.getMa()+" "+this.getName()+" "+this.getPlace()+" "
                            +this.getVectorAsString()
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
            i.setMa();
            i.setVector();
            res.add(i);
        }
        Collections.sort(res, new Comparator<sv>() {
            @Override
            public int compare(sv o1, sv o2) {
                return o1.getVectorAsLong() > o2.getVectorAsLong() ? -1:1;
            }
        });
        for(sv i :res){
            i.xuat();
        }
    }
}
