package codePtit;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    static class Sv{
        private String name;
        private String ngay;

        private void nhap(Scanner s){
            name = s.next();
            ngay = s.next();
        }

        public String getName(){
            return name;
        }

        public long getTime(){
            SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
            Date d1 = null;
            Date d2 = null;
            try{
                d1 = sf.parse("13/09/2021");
                d2 = sf.parse(this.ngay);
            }catch(Exception e){
                e.printStackTrace();
            }
            long diff = d1.getTime() - d2.getTime();
            return diff;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Sv> res=  new ArrayList<>();
        Map<Long, String> m = new HashMap<>();
        while(n-->0){
            Sv a = new Sv();
            a.nhap(s);;
            res.add(a);
            m.put(a.getTime(),a.getName());
        }
        long tn = res.stream().min(Comparator.comparing(Sv::getTime)).get().getTime();
        long gn = res.stream().max(Comparator.comparing(Sv::getTime)).get().getTime();
        System.out.println(m.get(tn));
        System.out.println(m.get(gn));
    }

}