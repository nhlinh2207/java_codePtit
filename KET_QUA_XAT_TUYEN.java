package codePtit;
import java.util.*;

class sv{
    private String ma;
    private String name;
    private String birth;
    private float diem1;
    private float diem2;
    private float diemthuong;
    private String loai;
    private int tong;
    private int tuoi;

    public sv(){}

    public void nhap(Scanner s){
        s.nextLine();
        name = s.nextLine();
        birth = s.nextLine();
        diem1 = s.nextFloat();
        diem2 = s.nextFloat();
    }

    public void setMa(int a){
        ma = (a < 10) ? "PH0"+a : "PH"+a;
    }

    public void setTuoi(){
        String nam = birth.split("/")[2];
        tuoi = 2021 - Integer.valueOf(nam);
    }

    public void setDiemthuong(){
        if (diem1 >= 8 && diem2 >= 8)
            diemthuong = 1;
        else if (diem1 >= 7.5 && diem2 >= 7.5)
            diemthuong = 0.5f;
        else diemthuong = 0;
    }

    public void setTong(){
        tong = Math.round(diemthuong + (diem2+diem1)/2);
        if (tong > 10) tong = 10;
    }

    public void setLoai(){
        if (tong < 5) loai = "Truot";
        else if (tong == 5 || tong == 6) loai = "Trung binh";
        else if (tong == 7) loai = "Kha";
        else if (tong == 8) loai = "Gioi";
        else if (tong == 9 || tong == 10) loai = "Xuat sac";
    }

    public int getTong(){return tong;}

    public void xuat(){
        System.out.println(ma+" "+name+" "+tuoi+" "+tong+" "+loai);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> res = new ArrayList<>();
        int c = 1;
        while (n-->0) {
            sv a = new sv();
            a.nhap(s);
            a.setMa(c);
            c++;
            a.setTuoi();
            a.setDiemthuong();
            a.setTong();
            a.setLoai();
            res.add(a);
        }
        //Collections.sort(res,Comparator.comparing(sv::getMa));
        //Collections.sort(res, Comparator.comparing(sv::getTong, Comparator.reverseOrder()));
        for (sv i: res)
            i.xuat();
    }
}