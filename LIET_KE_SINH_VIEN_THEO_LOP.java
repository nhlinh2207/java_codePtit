package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String clas;
        private String email;

        public sv(){}

        public void nhap(Scanner s){
            ma = s.next();
            s.nextLine();
            name = s.nextLine();
            clas = s.next();
            email = s.next();
        }

        public String getMa(){return ma;}
        public String getClas(){ return clas;}
        public String getName(){return name;}
        public String getEmail(){return email;}
        public void xuat(){
            System.out.println(this.getMa()+" "+this.getName()+" "+this.getClas()+" "+this.getEmail());
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Map<String, List<sv>> res = new LinkedHashMap<String, List<sv>>();
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            if (!res.containsKey(i.getClas())){
                res.put(i.getClas(),new ArrayList<sv>());
            }
            List<sv> temp = res.get(i.getClas());
            temp.add(i);
            res.put(i.getClas(),temp);
        }
        int q = s.nextInt();
        while(q-->0){
            String lop = s.next();
            List<sv> kq = res.get(lop);
            System.out.println("DANH SACH SINH VIEN LOP "+lop+": ");
            for (sv i: kq){
                i.xuat();
            }
        }
    }
}