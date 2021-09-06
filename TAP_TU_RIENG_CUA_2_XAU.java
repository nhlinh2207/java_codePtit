package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        while(n > 0){
            String s1 = s.nextLine();
            String s2 = s.nextLine();
            List<String> k1 = new ArrayList<String>(Arrays.asList(s1.split("\\s")));
            List<String> k2 = new ArrayList<String>(Arrays.asList(s2.split("\\s")));
            k1 = k1.stream().sorted().collect(Collectors.toList());
            Set<String> set = new LinkedHashSet<>();
            for (String i: k1){
                if(!k2.contains(i))
                    set.add(i);
            }
            for (String i: set)
                System.out.print(i+" ");
            System.out.println();
            n--;
        }
    }
}
