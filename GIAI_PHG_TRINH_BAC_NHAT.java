package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        if(a == 0 && b!= 0){
            System.out.println("VN");
        }else if(a == 0 && b==0){
            System.out.println("VSN");
        }else if(a != 0 && b == 0){
            System.out.println("0.00");
        }else{
            System.out.println(String.format("%.2f",-b/a));
        }
    }
}
