package codePtit;

import java.util.Scanner;

public class Test {
    static class point{
        private double d1;
        private double d2;

        public point(){}

        public void nhap(Scanner s){
            d1 = s.nextDouble();
            d2 = s.nextDouble();
        }

        public double getD1(){return d1;}

        public double getD2(){return d2;}
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-->0){
            point p1 = new point();
            p1.nhap(s);
            point p2 = new point();
            p2.nhap(s);
            double hieu = Math.pow((p2.getD1() - p1.getD1()),2) + Math.pow((p2.getD2() - p1.getD2()), 2);
            System.out.println(String.format("%.4f", Math.sqrt(hieu)));
        }
    }
}
