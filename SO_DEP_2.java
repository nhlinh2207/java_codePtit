package codePtit;

import java.util.*;

public class Test {
    public static int tn(List<String> a){
        int tong = 0;
        int l = 0, r = a.size()-1;
        while(l <= r){
            if(Integer.parseInt(a.get(l)) != Integer.parseInt(a.get(r)))
                return 0;
            else{
                if(l == r) tong+=Integer.parseInt(a.get(l));
                else tong+=(Integer.parseInt(a.get(l))+Integer.parseInt(a.get(r)));
            }
            l++; r--;
        }
        if(tong % 10 ==0 )return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        while(n > 0){
            int c = 0;
            String str  = s.nextLine();
            List<String> a = new ArrayList<>(Arrays.asList(str.split("")));
            if(a.get(a.size()-1).equals("8")){
                if(tn(a) == 1) System.out.println("YES");
                else
                    System.out.println("NO");
            }else{
                System.out.println("NO");
            }
            n--;
        }
    }
}
