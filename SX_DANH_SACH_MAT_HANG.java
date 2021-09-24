package codePtit;
import java.util.*;

class sv{
    private String ma;
    private String name;
    private String birth;
    private float diem1;
    private float diem2;
    private float lai;

    public sv(){}

    public void nhap(Scanner s){
        s.nextLine();
        name = s.nextLine();
        birth = s.nextLine();
        diem1 = s.nextFloat();
        diem2 = s.nextFloat();
    }


    public void setMa(int a){
        ma = Integer.toString(a);
    }

    public void setLai(){
        lai = diem2 - diem1;
    }

    public float getLai() {
        return lai;
    }

    public String gettongString(){
        return String.format("%.2f", lai);
    }

    public void xuat(){
        System.out.println(ma+" "+name+" "+birth+" "+gettongString());
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
            a.setLai();
            res.add(a);
        }
        Collections.sort(res, Comparator.comparing(sv::getLai, Comparator.reverseOrder()));
        for (sv i : res){
            i.xuat();
        }
    }
}