package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        while(n>0){
            String a = s.nextLine();
            a = a.trim();
            List<String> b = new ArrayList<String>(Arrays.asList(a.split("\\s+")));
            for (String i: b){
                i = i.toLowerCase();
                String temp = i.substring(0,1).toUpperCase() + i.substring(1);
                System.out.print(temp+" ");
            }
            System.out.println();
            n--;
        }
    }
}
