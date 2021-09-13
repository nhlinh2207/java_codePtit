package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class khack{
        private String ma;
        private String ten;
        private String gioi;
        private String ngaysinh;
        private String diachi;

        public void nhap(Scanner s){
            ten = s.nextLine();
            gioi = s.nextLine();
            ngaysinh = s.nextLine();
            diachi = s.nextLine();
        }

        public void setMa(int a){
            ma = a < 10? "KH00"+a : "KH0"+a;
        }
        public String getMa(){return ma;}
        public String getTen(){return ten;}
        public String getGioi(){return gioi;}
        public String getNgaysinh(){return ngaysinh;}
        public String getDiachi(){return diachi;}
    }
    static class mathang{
        private String ma;
        private String ten;
        private String donvi;
        private long giamua;
        private long giaban;

        public void nhap(Scanner s){
            s.nextLine();
            ten = s.nextLine();
            donvi = s.next();
            giamua = s.nextLong();
            giaban = s.nextLong();
        }

        public void setMa(int a){
            ma = a<10 ? "MH00"+a : "MH0"+a;
        }
        public String getMa(){return ma;}
        public String getTen(){return ten;}
        public String getDonvi(){return donvi;}
        public long getGiamua(){return giamua;}
        public long getGiaban(){return giaban;}
    }
    static class hoadon{
        private String mahoadon;
        private String makhach;
        private String mamathang;
        private int soluong;
        private long loinhuan;

        public void nhap(Scanner s){
            makhach = s.next();
            mamathang = s.next();
            soluong = s.nextInt();
        }

        public void setMahoadon(int a){
            mahoadon = a<10 ? "HD00"+a : "HD0"+a;
        }

        public void setLoinhuan(List<mathang> mh){
            mathang m = null;
            for (mathang i: mh){
                if(i.getMa().equals(mamathang)){
                    m = i;
                    break;
                }
            }
            loinhuan = m.getGiaban()*soluong - m.getGiamua()*soluong;
        }
        public long getLoinhuan(){return loinhuan;}

        public void xuat(List<khack> k, List<mathang> m){
            khack khach = null;
            mathang math = null;
            for (khack i: k){
                if (i.getMa().equals(makhach)){
                    khach = i;
                    break;
                }
            }
            for (mathang i : m){
                if (i.getMa().equals(mamathang)){
                    math = i;
                    break;
                }
            }
            System.out.println(
                    this.mahoadon+" "+khach.getTen()+" "+khach.getDiachi()+" "+math.getTen()
                    +" "+this.soluong+" "+(this.soluong)*math.getGiaban()+" "+this.loinhuan
            );
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = Integer.parseInt(s.nextLine());
        List<khack> khachhang = new ArrayList<>();
        int a = 1;
        while (k-->0){
            khack i = new khack();
            i.nhap(s);
            i.setMa(a);
            a++;
            khachhang.add(i);
        }
        List<mathang> hang = new ArrayList<>();
        int m = s.nextInt();
        a = 1;
        while(m-->0){
            mathang i = new mathang();
            i.nhap(s);
            i.setMa(a);
            a++;
            hang.add(i);
        }
        int hd = s.nextInt();
        a = 1;
        List<hoadon> hdlist = new ArrayList<>();
        while(hd-->0){
            hoadon i = new hoadon();
            i.nhap(s);
            i.setMahoadon(a);
            i.setLoinhuan(hang);
            a++;
            hdlist.add(i);
        }
        Collections.sort(hdlist,Comparator.comparing(hoadon::getLoinhuan,Comparator.reverseOrder()));
        for(hoadon i: hdlist){
            i.xuat(khachhang, hang);
        }
    }
}