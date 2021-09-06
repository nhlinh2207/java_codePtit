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
            List<String> res = new ArrayList<>();
            for (String i: b){
                i = i.toLowerCase();
                String temp = i.substring(0,1).toUpperCase() + i.substring(1);
                res.add(temp);
            }
            System.out.print(res.get(1));
            for(int i = 2;i< res.size();i++){
                System.out.print(" "+res.get(i));
            }
            System.out.print(", ");
            System.out.println(res.get(0).toUpperCase());
            System.out.println();
            n--;
        }
    }
}
