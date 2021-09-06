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
            point p3 = new point();
            p3.nhap(s);
            double canh1 = Math.sqrt(Math.pow((p2.getD1() - p1.getD1()),2) + Math.pow((p2.getD2() - p1.getD2()), 2));
            double canh2 = Math.sqrt(Math.pow((p3.getD1() - p1.getD1()),2) + Math.pow((p3.getD2() - p1.getD2()), 2));
            double canh3 = Math.sqrt(Math.pow((p3.getD1() - p2.getD1()),2) + Math.pow((p3.getD2() - p2.getD2()), 2));
            if (canh1+canh2>canh3 && canh1+canh3>canh2 && canh3+canh2>canh1){
                double cv = canh1+canh2+canh3;
                System.out.println(String.format("%.3f", cv));
            }else{
                System.out.println("INVALID");
            }
        }
    }
}
