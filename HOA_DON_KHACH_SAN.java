package codePtit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String phong;
        private String start;
        private String end;
        private long phatsinh;
        private long songay;
        private long tong;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            phong = s.next();
            start = s.next();
            end = s.next();
            phatsinh = s.nextLong();
        }

        public void setMa(int i){
            ma = (i<10) ? "KH0"+i : "KH"+i ;
        }
        public String getMa(){return ma;}

        public String getName(){return name;}

        public void setSongay(){
           String bd[] = start.split("/");
           String kt[] = end.split("/");
           start = bd[bd.length-1];
           for (int i = bd.length-2;i>=0;i--){
               start+="-"+bd[i];
           }
           end = kt[kt.length-1];
           for (int i = kt.length-2;i>=0;i--){
               end+="-"+kt[i];
           }
           LocalDate dBefore = LocalDate.parse(start, DateTimeFormatter.ISO_LOCAL_DATE);
           LocalDate dAfter = LocalDate.parse(end, DateTimeFormatter.ISO_LOCAL_DATE);

           songay = dBefore.until(dAfter, ChronoUnit.DAYS)+1;
        }
        public long getSongay(){
            return songay;
        }

        public void setTong(){
            int tienphong = 0;
            if(phong.charAt(0) == '1')
                tienphong = 25;
            else if (phong.charAt(0) == '2')
                tienphong = 34;
            else if (phong.charAt(0) == '3')
                tienphong = 50;
            else if (phong.charAt(0) == '4')
                tienphong = 80;
            tong = tienphong*songay+phatsinh;
        }
        public long getTong(){
            return tong;
        }

        public String getPhong(){
            return phong;
        }

        public void xuat(){
            System.out.println(
                    this.getMa()+" "+this.getName()+" "+this.getPhong()+" "+
                            this.getSongay()+" "+this.getTong()
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
            i.setSongay();
            i.setTong();
            res.add(i);
            a++;
        }
        Collections.sort(res, new Comparator<sv>() {
            @Override
            public int compare(sv o1, sv o2) {
                return o1.getTong()>o2.getTong()?-1:1;
            }
        });
        for(sv i :res){
            i.xuat();
        }
    }
}
