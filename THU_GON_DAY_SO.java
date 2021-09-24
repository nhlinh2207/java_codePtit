package codePtit;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> res = new ArrayList<>();
        for (int i = 0;i<n;i++){
            res.add(s.nextInt());
        }
        for(int i = 0;i<res.size()-1;){
            if ((res.get(i)+res.get(i+1)) %2 == 0){
                res.remove(i);
                res.remove(i);
                if (i != 0){
                    i = i-1;
                }else i = 0;
            }else
                i++;
        }
        System.out.println(res.size());
    }
}