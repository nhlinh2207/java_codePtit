package codePtit;

import java.util.*;

public class Test {
    static class sv{
        private String ma;
        private String loai;
        private long socu;
        private long somoi;
        private long heso;
        private long thanhtien;
        private long phutroi;

        public sv(){}

        public void nhap(Scanner s) {
            loai = s.next();
            socu = s.nextLong();
            somoi = s.nextLong();
        }

        public void setMa(int a){
            ma = (a<10) ? "KH0"+a :"KH"+a;
        }
        public String getMa(){return ma;}

        public void setHeso(){
            if (loai.equals("KD"))
                heso = 3;
            else if(loai.equals("NN"))
                heso = 5;
            else if(loai.equals("TT"))
                heso = 4;
            else if(loai.equals("CN"))
                heso = 2;
        }
        public long getHeso(){return heso;}

        public void setThanhtien(){
            thanhtien = (somoi - socu)*heso*550;
        }
        public long getThanhtien(){return thanhtien;}

        public void setPhutroi(){
            if(somoi - socu > 100)
                phutroi = thanhtien;
            else if(somoi - socu >= 50 && somoi - socu <= 100){
                phutroi = Math.round((float)35/100*thanhtien);
            }else if(somoi - socu < 50){
                phutroi = 0;
            }
        }
        public long getPhutroi(){
            return phutroi;
        }

        public void xuat(){
            System.out.println(
                    this.getMa()+" "+this.getHeso()+" "+this.getThanhtien()+" "+this.getPhutroi()
                    +" "+(this.getThanhtien()+this.getPhutroi())
            );
        }
        public long getTienPhaiTra(){
            return this.getPhutroi()+this.getThanhtien();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        List<sv> res = new ArrayList<>();
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            i.setMa(a);
            a++;
            i.setHeso();
            i.setThanhtien();
            i.setPhutroi();
            res.add(i);
        }
        Collections.sort(res, Comparator.comparing(sv::getTienPhaiTra,Comparator.reverseOrder()));
        for (sv i :res){
            i.xuat();
        }
    }
}
