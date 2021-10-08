package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private float tbc;
        private int rl;
        private String hb;
        private String name;
        private int rank;
        public sv(){}

        public void nhap(Scanner s){
           s.nextLine();
           name = s.nextLine();
           tbc = s.nextFloat();
           rl = s.nextInt();
        }

        public void setHb(){
            if (rl >= 90 && tbc >= 3.6) {
                hb = "XUATSAC";
                rank = 1;
            }
            else if(tbc >= 3.2  && rl>= 80) {
                hb = "GIOI";
                rank = 2;
            }
            else if (tbc >= 2.5 && rl >= 70) {
                hb = "KHA";
                rank = 3;
            }else {
                hb = "KHONG";
                rank = 4;
            }
        }

        public void setHb(String a){
            hb = a;
        }

        public void xuat(){
            System.out.println(name+": "+hb);
        }

        public float getTbc(){
            return tbc;
        }

        public int getRl(){
            return rl;
        }

        public int getRank(){
            return rank;
        }

        public String getHb(){return hb;}
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int solg = s.nextInt();
        List<sv> res = new ArrayList<>();
        while(n-->0){
            sv a = new sv();
            a.nhap(s);
            a.setHb();
            res.add(a);
        }
        List<sv> temp1 = res.stream().sorted(Comparator.comparing(sv::getRank)).collect(Collectors.toList());
        List<sv> temp2 = temp1.stream().sorted(Comparator.comparing(sv::getTbc, Comparator.reverseOrder())).collect(Collectors.toList());
        for(int i = solg; i<temp2.size(); i++){
           if (temp2.get(i).getTbc() != temp2.get(solg-1).getTbc() || temp2.get(i).getRank() != temp2.get(solg-1).getRank())
               temp2.get(i).setHb("KHONG");
        }
        for (sv i : res)
            i.xuat();
    }
}
