package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private long soluong;
        private long dongia;
        private long chietkhau;
        private long total;
        public sv(){}

        public void nhap(Scanner s){
            ma = s.next();
            s.nextLine();
            name = s.nextLine();
            soluong = s.nextLong();
            dongia = s.nextLong();
            chietkhau = s.nextLong();
        }
        public String getMa(){return ma;}
        public String getName(){return name;}
        public long getSoluong(){
            return soluong;
        }
        public long getDongia(){
            return  dongia;
        }
        public long getChietkhau(){
            return chietkhau;
        }
        public long getTotal(){
            return soluong*dongia - chietkhau;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> res = new ArrayList<>();
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            res.add(i);
        }
        Collections.sort(res, new Comparator<sv>() {
            @Override
            public int compare(sv o1, sv o2) {
               return o1.getTotal() > o2.getTotal() ? -1:1;
            }
        });
        for(sv i :res){
            System.out.println(
                    i.getMa()+" "+i.getName()+" "+i.getSoluong()+" "+i.getDongia()
                    +" "+i.getChietkhau()+" "+i.getTotal()
            );
        }
    }
}
