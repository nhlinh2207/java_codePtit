package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private int stt;
        private String ma;
        private String name;
        private String clas;
        private String email;
        private String nhom;

        public sv(){}

        public void nhap(Scanner s){
            ma = s.next();
            s.nextLine();
            name = s.nextLine();
            clas = s.next();
            email = s.next();
            nhom = s.next();
        }
        public void setStt(int a){stt = a;}
        public int getStt(){return stt;}
        public String getMa(){return ma;}
        public String getClas(){ return clas;}
        public String getName(){return name;}
        public String getEmail(){return email;}
        public String getNhom(){return nhom;}
        public void xuat(){
            System.out.println(this.getStt()+" "+this.getMa()+" "+this.getName()+" "+this.getClas()+" "+this.getEmail()+" "+this.getNhom());
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        Map<String, List<sv>> res = new LinkedHashMap<String, List<sv>>();
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            i.setStt(a);
            a++;
            if (!res.containsKey(i.getNhom())){
                res.put(i.getNhom(),new ArrayList<sv>());
            }
            List<sv> temp = res.get(i.getNhom());
            temp.add(i);
            res.put(i.getNhom(),temp);
        }
        int q = s.nextInt();
        while(q-->0){
            String nhom = s.next();
            List<sv> kq = res.get(nhom);
            Collections.sort(kq, Comparator.comparing(sv::getName));
            for (sv i: kq){
                i.xuat();
            }
        }
    }
}