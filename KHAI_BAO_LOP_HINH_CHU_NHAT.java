package codePtit;
import java.util.*;

public class Test {
    static class hcn{
        private double width;
        private double height;
        private String color;

        public hcn(){}

        public void nhap(Scanner s) {
            width = s.nextDouble();
            height = s.nextDouble();
            color = s.next();
        }

        public void setColor(){
            color = color.toLowerCase();
            color = Character.toUpperCase(color.charAt(0))+color.substring(1);
        }
        public String getColor(){return color;}

        public void xuat(){
            if (width%1 != 0 || width<=0 || height%1 != 0 || height<=0){
                System.out.println("INVALID");
            }else{
                System.out.println(
                        String.format("%.0f", (width+height)*2)+" "+String.format("%.0f", width*height)+" "+this.getColor()
                );
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        hcn a = new hcn();
        a.nhap(s);
        a.setColor();
        a.xuat();
    }
}
