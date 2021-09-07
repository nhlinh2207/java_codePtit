package codePtit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    static class Point{
        private double d1;
        private double d2;

        public Point(){}

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
            List<Double> x = new ArrayList<>();
            List<Double> y = new ArrayList<>();
            int sodinh = s.nextInt();
            while (sodinh-->0){
                Point p = new Point();
                p.nhap(s);
                x.add(p.getD1());
                y.add(p.getD2());
            }
            int j = x.size()-1;
            double area = 0;
            for (int i = 0;i<x.size(); i++){
                area += (x.get(j) + x.get(i)) * (y.get(j) - y.get(i));
                j=i;
            }
            System.out.println(String.format("%.3f",Math.abs(area/2.0)));
        }
    }
}
