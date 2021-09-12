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
        List<sv> res = new ArrayList<>();
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            res.add(i);
        }
        Collections.sort(res, Comparator.comparing(sv::getMa));
        Collections.sort(res,Comparator.comparing(sv::getClas));
        for (sv i: res){
            i.xuat();
        }
    }
}