package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String phone;
        private int nhom;

        public sv(){}

        public void nhap(Scanner s){
            ma = s.next();
            s.nextLine();
            name = s.nextLine();
            phone = s.next();
            nhom = s.nextInt();
        }
        public String getMa(){return ma;}
        public String getPhone(){ return phone;}
        public String getName(){return name;}
        public int getNhom(){return nhom;}
        public void xuat(Map<Integer, String> m){
            System.out.println(this.getMa()+" "+this.getName()+" "+this.getPhone()+" "+this.getNhom()+" "+m.get(this.getNhom()));
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        List<sv> res = new ArrayList<>();
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            res.add(i);
        }
        Map<Integer, String> project = new HashMap<>();
        int a = 1;
        s.nextLine();
        while (m-->0){
            String proname = s.nextLine();
            project.put(a,proname);
            a++;
        }
        Collections.sort(res, Comparator.comparing(sv::getMa));
        for (sv i :res){
            i.xuat(project);
        }
    }
}