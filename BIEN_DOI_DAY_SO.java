package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> a = new ArrayList<>();
        while (n-->0){
           a.add(s.nextInt());
        }
        List<Integer> b = new ArrayList<>();
        for (int i = 1; i<=a.get(a.size()-1); i++){
            b.add(i);
        }
        int c = 0;
        for (Integer i : b){
            if (!a.contains(i)){
                System.out.println(i);
                c = 1;
            }
        }
        if (c == 0){
            System.out.println("Excellent!");
        }
    }
}