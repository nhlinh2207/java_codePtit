package codePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {

    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       while (n-->0){
           String str = s.next();
           str = str.toLowerCase();
           String res = "";
           for(int i = 0;i<str.length(); i++){
               char j = str.charAt(i);
               if(j == 'a' || j == 'b' || j == 'c' || j=='2'){
                   res += "2";
               }else if(j == 'd' || j == 'e' || j == 'f' || j=='3'){
                   res += "3";
               }else if(j == 'g' || j == 'h' || j == 'i' || j == '4'){
                   res += "4";
               }else if(j == 'j' || j == 'k' || j == 'l' || j == '5'){
                   res += "5";
               }else if(j == 'm' || j == 'n' || j == 'o'|| j=='6'){
                   res += "6";
               }else if(j == 'p' || j == 'q' || j == 'r' || j == 's' || j=='7'){
                   res += "7";
               }else if(j == 't' || j == 'u' || j == 'v' ||j == '8'){
                   res += "8";
               }else{
                   res += "9";
               }
           }
           if (res.equals(new StringBuilder(res).reverse().toString())){
               System.out.println("YES");
           }else{
               System.out.println("NO");
           }
       }
    }
}
