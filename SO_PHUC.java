package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private int phanthuc;
        private int phanao;

        public sv(){}

        public void nhap(Scanner s){
            phanthuc = s.nextInt();
            phanao = s.nextInt();
        }

        public int getPhanthuc(){return phanthuc;}
        public int getPhanao(){return phanao;}
        public void setPhanthuc(int a){
            phanthuc = a;
        }
        public void setPhanao(int a){
            phanao = a;
        }

        public void tinh1(sv b){
            sv temp = new sv();
            temp.setPhanthuc(this.phanthuc + b.getPhanthuc());
            temp.setPhanao(this.phanao + b.getPhanao());
            int t1 = temp.getPhanthuc()*phanthuc - temp.getPhanao()*phanao;
            int a1 = temp.getPhanthuc()*phanao + temp.getPhanao()*phanthuc;
            System.out.print(t1+" ");
            if (a1 < 0){
                System.out.print("- "+Math.abs(a1)+"i");
            }else if(a1 >= 0){
                System.out.print("+ "+Math.abs(a1)+"i");
            }
            System.out.print(", ");
            //-8 + 14i, -20 + 48i
        }

        public void tinh2(sv b){
            sv temp = new sv();
            temp.setPhanthuc(this.phanthuc + b.getPhanthuc());
            temp.setPhanao(this.phanao + b.getPhanao());
            int t1 = temp.getPhanthuc()*temp.getPhanthuc() - temp.getPhanao()*temp.getPhanao();
            int a1 = temp.getPhanthuc()*temp.getPhanao() + temp.getPhanao()*temp.getPhanthuc();
            System.out.print(t1+" ");
            if (a1 < 0){
                System.out.print("- "+Math.abs(a1)+"i");
            }else if(a1 > 0){
                System.out.print("+ "+Math.abs(a1)+"i");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            sv a = new sv();
            sv b = new sv();
            a.nhap(s);
            b.nhap(s);
            a.tinh1(b);
            a.tinh2(b);
        }
    }
}
