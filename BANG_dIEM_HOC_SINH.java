package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private List<Float> diem = new ArrayList<Float>();
        private float tb;
        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            for (int i = 0;i<10;i++){
                float a = s.nextFloat();
                diem.add(a);
            }
        }
        public void setMa(int i){
            ma = (i<10) ? "HS0"+i: "HS"+i;
        }
        public String getMa(){return ma;}
        public String getName(){return name;}
        public void settb(){
            float sum = 0;
            sum+= diem.get(0)*2+diem.get(1)*2;
            for (int i=2;i<diem.size();i++){
                sum+=diem.get(i);
            }
            tb = sum/12;
            int temp = Math.round(tb*10);
            tb = (float)temp/10;
        }
        public  float getTb(){
            return tb;
        }

        public String getLoai(){
            if(tb>9.0){
                return "XUAT SAC";
            }else if(tb>= 8.0 && tb<=8.9){
                return "GIOI";
            }else if(tb>= 7.0 && tb<=7.9){
                return "KHA";
            }else if(tb>= 5.0 && tb<=6.9){
                return "TB";
            }else{
                return "YEU";
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> res = new ArrayList<>();
        int a = 1;
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            i.setMa(a);
            i.settb();
            res.add(i);
            a++;
        }
        Collections.sort(res,Comparator.comparing(sv::getTb, Comparator.reverseOrder()));
        for(sv i :res){
            System.out.println(
                    i.getMa()+" "+i.getName()+" "+i.getTb()+" "+i.getLoai()
            );
        }
    }
}
