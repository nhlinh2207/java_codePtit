package codePtit;

import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String t1;
        private String t2;
        private float time;
        private float rain;
        private float average;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            t1 = s.next();
            t2 = s.next();
            rain = s.nextFloat();
        }

        public void setMa(int i){
            ma = (i<10) ? "T0"+i : "T"+i ;
        }
        public String getMa(){return ma;}

        public String getName(){return name;}

        public void setTime(){
            String bd[] = t1.split(":");
            String kt[] = t2.split(":");
            float totalminus = (Integer.parseInt(kt[0])*60+Integer.parseInt(kt[1])) - (Integer.parseInt(bd[0])*60 + Integer.parseInt(bd[1]));
            float totalTime = totalminus/60;
            time = totalTime;
        }
        public float getTime(){
            return time;
        }
        public void addTime(float i){
            time += i;
        }

        public void addRain(float i){
            rain+=i;
        }
        public float getRain(){
            return rain;
        }

        public void setAverage(){
            average = rain/time;
        }
        public String getAverageAsString(){
            return String.format("%.2f",average);
        }
        public float getAverageAsFloat(){
            return average;
        }
        public void xuat(){
            System.out.println(
                    this.getMa()+" "+this.getName()+" "+this.getAverageAsString()
            );
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<String> name = new ArrayList<>();
        List<sv> res = new ArrayList<>();
        int a = 1;
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            if (!name.contains(i.getName())){
                i.setMa(a);
                i.setTime();
                res.add(i);
                name.add(i.getName());
                a++;
            }else{
                int index = name.indexOf(i.getName());
                i.setTime();
                res.get(index).addRain(i.getRain());
                res.get(index).addTime(i.getTime());
            }
        }
        for (sv i : res){
            i.setAverage();
        }
        for(sv i :res){
            i.xuat();
        }
    }
}
