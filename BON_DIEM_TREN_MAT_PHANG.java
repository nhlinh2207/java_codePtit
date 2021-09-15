package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class Point3D{
        private int x;
        private int y;
        private int z;

        public Point3D(int a, int b, int c){
            x = a;
            y = b;
            z = c;
        }

        public void setX(int a){x = a;}
        public void setY(int a){y = a;}
        public void setZ(int a){z = a;}

        public int getX(){return x;}
        public int getY(){return y;}
        public int getz(){return z;}

        public Point3D vecor(Point3D b){
            Point3D v = new Point3D(x*b.getz() - b.getX()*z, z*b.getX() - b.getz()*x, x*b.getY() - b.getX()*y);
            return v;
        }
        public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
            Point3D vec1 = new Point3D(p2.getX() - p1.getX(), p2.getY() - p1.getY(), p2.getz() - p1.getz());
            Point3D vec2 = new Point3D(p3.getX() - p1.getX(), p3.getY() - p1.getY(), p3.getz() - p1.getz());
            Point3D vec3 = new Point3D(p4.getX() - p4.getX(), p4.getY() - p1.getY(), p4.getz() - p1.getz());
            Point3D v = vec1.vecor(vec2);
            if(vec3.getX()*v.getX() + vec3.getY()*v.getY() + vec3.getz()*v.getz() == 0){
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0) {
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
            }
       }
}
