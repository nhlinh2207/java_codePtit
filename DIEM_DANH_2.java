package codePtit;

import java.util.*;

public class Test {
    static class sv {
        private String ma;
        private String name;
        private String lop;
        private int diem;

        public sv() {
            diem = 10;
        }

        public void nhap(Scanner s) {
            ma = s.next();
            s.nextLine();
            name = s.nextLine();
            lop = s.next();
        }

        public void setDiem(String t) {
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) == 'v')
                    diem -= 2;
                if (t.charAt(i) == 'm')
                    diem -= 1;
            }
        }

        public void xuat() {
            System.out.println(ma + " " + name + " " + lop + " " + (diem <= 0 ? "0" : diem) + " " + (diem <= 0 ? "KDDK" : ""));
        }

        public String getLop(){return lop;}

        public String getMa() {
            return ma;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = n;
        List<sv> temp = new ArrayList<>();
        while (n-- > 0) {
            sv a = new sv();
            a.nhap(s);
            temp.add(a);
        }
        while (m-- > 0) {
            String ma = s.next();
            String diemdanh = s.next();
            for (sv i : temp) {
                if (i.getMa().equals(ma)) {
                    i.setDiem(diemdanh);
                    break;
                }
            }
        }
        String lop = s.next();
        for (sv i : temp) {
            if (i.getLop().equals(lop))
                i.xuat();
        }
    }
}