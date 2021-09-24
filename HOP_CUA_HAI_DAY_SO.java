package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<Integer> set = new LinkedHashSet<>();
        int n = s.nextInt();
        int m = s.nextInt();
        for (int i = 0;i<n;i++){
            set.add(s.nextInt());
        }
        for (int i = 0;i<m;i++){
            set.add(s.nextInt());
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for (Integer i: list){
            System.out.print(i+" ");
        }
    }
}