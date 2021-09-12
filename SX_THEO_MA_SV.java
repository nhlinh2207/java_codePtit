package codePtit;

import java.io.File;
import java.io.FileNotFoundException;
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

        public void setMa(String a){ma = a;}
        public void setName(String a){name = a;}
        public void setClas(String a){clas = a;}
        public void setEmail(String a){email = a;}

        public String getMa(){return ma;}
        public String getClas(){ return clas;}
        public String getName(){return name;}
        public String getEmail(){return email;}
        public void xuat(){
            System.out.println(this.getMa()+" "+this.getName()+" "+this.getClas()+" "+this.getEmail());
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = 0;
        List<sv> res = new ArrayList<>();
        sv p = new sv();
        while(s.hasNextLine()){
            if (n==0) {
                p.setMa(s.nextLine());
                n++;
            }
            else if (n==1) {
                p.setName(s.nextLine());
                n++;
            }
            else if (n==2) {
                p.setClas(s.nextLine());
                n++;
            }
            else if (n==3){
                p.setEmail(s.nextLine());
                res.add(p);
                p = new sv();
                n=0;
            }
        }
        Collections.sort(res, Comparator.comparing(sv::getMa));
        for (sv i: res){
            i.xuat();
        }
    }
}
