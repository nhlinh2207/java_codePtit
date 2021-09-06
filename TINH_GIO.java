package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String bd;
        private String kt;
        private  int totaltime;

        public sv(){}

        public void nhap(Scanner s){
            ma = s.next();
            s.nextLine();
            name = s.nextLine();
            bd= s.next();
            kt = s.next();
        }

        public String getMa(){return ma;}
        public String getName(){return name;}
        public void setTotalTime(){
            String timebd[] = bd.split(":");
            String timekt[] = kt.split(":");
            int giobd = Integer.parseInt(timebd[0]);
            int phutbd = Integer.parseInt(timebd[1]);
            int giokt = Integer.parseInt(timekt[0]);
            int phutkt = Integer.parseInt(timekt[1]);
            totaltime = (giokt*60 + phutkt) - (giobd*60 + phutbd);
        }
        public int getTotaltime(){
            return totaltime;
        }
        public String getrestime(){
            if (totaltime < 60)
                return "0 gio "+totaltime+" phut";
            else{
                int h = (int)(totaltime/60);
                int p = totaltime -h*60;
                return h+" gio "+p+" phut";
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> res = new ArrayList<>();
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            i.setTotalTime();
            res.add(i);
        }
        Collections.sort(res, new Comparator<sv>() {
            @Override
            public int compare(sv o1, sv o2) {
                return o1.getTotaltime()>o2.getTotaltime()?-1:1;
            }
        });
        for(sv i :res){
            System.out.println(
                    i.getMa()+" "+i.getName()+" "+i.getrestime()
            );
        }
    }
}
