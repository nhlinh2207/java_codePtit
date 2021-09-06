package codePtit;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String gt;
        private String birth;
        private String address;
        private String mst;
        private String ngk;
        private List<sv> res = new ArrayList<>();

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            gt = s.next();
            birth = s.next();
            s.nextLine();
            address = s.nextLine();
            mst = s.next();
            ngk = s.next();
        }

        public void setMa(int i){
            ma = (i < 10) ? "0000"+Integer.toString(i):
                    "000"+ Integer.toString(i);
        }

        public String getMa(){return ma;}
        public String getGt(){ return gt;}
        public String getBirth(){return birth;}
        public String getName(){return name;}
        public String getAddress(){return address;}
        public String getMst(){return mst;}
        public String getNgk() {return ngk; }

        public Date getbirthday(){
            SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
            Date a = null;
            try {
                a = sd.parse(this.birth);
            }catch (Exception e){
                e.printStackTrace();
            }
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> res = new ArrayList<>();
        int a =1;
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            i.setMa(a);
            res.add(i);
            a++;
        }
        Collections.sort(res, new Comparator<sv>() {
            @Override
            public int compare(sv o1, sv o2) {
                return o1.getbirthday().before(o2.getbirthday())?-1:1;
            }
        });
        for (sv i:res){
            System.out.println(
                    i.getMa()+" "+i.getName()+" "+i.getGt()+" "+
                            i.getBirth()+" "+i.getAddress()+" "+i.getMst()+" "+
                            i.getNgk()
            );
        }
    }
}