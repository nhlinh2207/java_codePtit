package codePtit;
import java.util.*;

public class Test {

    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       s.nextLine();
       while (n-->0){
           String a = s.nextLine();
           String t[] = a.split(" ");
           String res = "";
           for (String i: t){
               res += new StringBuilder(i).reverse().toString()+" ";
           }
           System.out.println(res);
       }
    }
}