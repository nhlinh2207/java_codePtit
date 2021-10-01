package codePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    static class sv{
        private long t;
        private long d;

        public sv(){}

        public void nhap(Scanner s){
            t = s.nextLong();
            d = s.nextLong();
        }

        public long getT(){return t;}
        public long getD(){return d;}
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        List<sv> res = new ArrayList<>();
        int t = s.nextInt();
        while (t-->0){
            sv a = new sv();
            a.nhap(s);
            res.add(a);
        }
        Collections.sort(res, Comparator.comparing(sv::getT));
        long tong = res.get(0).getT()+res.get(0).getD();
        for (int i = 1; i < res.size(); i++){
            if (res.get(i).getT() <= tong)
                tong += res.get(i).getD();
            else
                tong = res.get(i).getD()+res.get(i).getT();
        }
        System.out.println(tong);
    }
}