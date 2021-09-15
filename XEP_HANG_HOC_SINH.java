package codePtit;

import java.io.DataInput;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private int stt;
        private String loai;
        private float diem;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            diem = s.nextFloat();
        }

        private void setStt(int a){
            stt = a;
        }

        public void setMa(int a){
            ma = (a < 10) ? "HS0"+a :"HS"+a ;
        }

        public void setLoai(){
            if(diem < 5){
                loai = "Yeu";
            }else if(diem >= 5 && diem < 7){
                loai = "Trung Binh";
            }else if(diem >= 7 && diem < 9){
                loai = "Kha";
            }else{
                loai = "Gioi";
            }
        }

        public float getDiem(){return diem;}
        public void in(){
            System.out.println(
                    this.ma+" "+this.name+" "+this.diem+" "+this.loai+" "+this.stt
            );
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
            a++;
            i.setLoai();
            res.add(i);
        }
        List<sv> diem = res.stream().sorted(Comparator.comparing(sv::getDiem, Comparator.reverseOrder())).collect(Collectors.toList());
        int status = 1;
        diem.get(0).setStt(status);
        int count = 1;
        for (int i = 1;i<diem.size();i++){
            if (diem.get(i).getDiem() == diem.get(i-1).getDiem()){
                diem.get(i).setStt(status);
                count++;
            }else{
               status = count+1;
               diem.get(i).setStt(status);
               count++;
            }
        }
        for(sv i :res){
            i.in();
        }
    }
}
