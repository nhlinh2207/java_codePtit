package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder b = new StringBuilder(str);
        for (int i = 0;i<b.length()-1;){
            if(b.charAt(i) == b.charAt(i+1)){
                b.delete(i,i+2);
                i=0;
            }else{
                i++;
            }
        }
        System.out.println(b.toString().isEmpty()?"Empty String":b.toString());
    }
}
