package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String clas;
        private String birth;
        private float diem;
        private List<sv> res = new ArrayList<>();

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            clas = s.next();
            birth = s.next();
            diem = s.nextFloat();
        }

        public void setMa(int i){
            ma = (i < 10) ? "B20DCCN00"+Integer.toString(i):
                    "B20DCCN0"+ Integer.toString(i);
        }

        public String getMa(){return ma;}
        public String getClas(){ return clas;}
        public String getBirth(){
            String a[] = birth.split("/");
            for (int i = 0;i<3;i++){
                if (a[i].length() < 2){
                    a[i] = "0"+a[i];
                }
            }
            return String.join("/",a);
        }
        public String getName(){
            name = name.trim();
            name = name.toLowerCase();
            String b[] = name.split("\\s+");
            for(int i = 0;i<b.length;i++){
                b[i] = Character.toUpperCase(b[i].charAt(0))+b[i].substring(1);
            }
            return String.join(" ",b);
        }
        public String getdiem(){
            return String.format("%.2f",diem);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a =1;
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            i.setMa(a);
            System.out.println(
                    i.getMa()+" "+i.getName()+" "+i.getClas()+" "+
                            i.getBirth()+" "+i.getdiem()
            );
            a++;
        }
    }
}
