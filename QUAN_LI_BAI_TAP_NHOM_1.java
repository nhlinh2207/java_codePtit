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
        public void xuat(){
            System.out.println(this.getMa()+" "+this.getName()+" "+this.getPhone());
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        Map<Integer, List<sv>> res = new LinkedHashMap<Integer, List<sv>>();
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            if (!res.containsKey(i.getNhom())){
                res.put(i.getNhom(),new ArrayList<sv>());
            }
            List<sv> temp = res.get(i.getNhom());
            temp.add(i);
            res.put(i.getNhom(),temp);
        }
        Map<Integer, String> project = new HashMap<>();
        int a = 1;
        s.nextLine();
        while (m-->0){
            String proname = s.nextLine();
            project.put(a, "Bai tap dang ky: "+proname);
            a++;
        }
        int q = s.nextInt();
        while(q-->0){
            int nhom = s.nextInt();
            System.out.println("DANH SACH NHOM "+nhom+": ");
            List<sv> kq = res.get(nhom);
            for (sv i: kq){
                i.xuat();
            }
            System.out.println(project.get(nhom));
        }
    }
}