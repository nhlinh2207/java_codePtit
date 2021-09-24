package codePtit;
import java.util.*;

class sv{
    private String ma;
    private String name;
    private String birth;
    private float diem1;
    private float diem2;
    private float diem3;
    private float tong;

    public sv(){}

    public void nhap(Scanner s){
        s.nextLine();
        name = s.nextLine();
        birth = s.nextLine();
        diem1 = s.nextFloat();
        diem2 = s.nextFloat();
        diem3 = s.nextFloat();
    }


    public void setMa(int a){
        ma = Integer.toString(a);
    }

    public void setTong(){
        tong = diem1 + diem2 + diem3;
    }

    public String gettongString(){
        if (tong % 1 == 0)
            return String.format("%.0f", tong);
        else return Float.toString(tong);
    }

    public void xuat(){
        System.out.println(ma +" "+name+" "+birth+" "+gettongString());
    }

    public float getTong(){
        return tong;
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
            a.setTong();
            res.add(a);
        }
        float ma = res.stream().max(Comparator.comparing(sv::getTong)).get().getTong();
        for (sv i : res){
            if (i.getTong() == ma)
                i.xuat();
        }
    }
}