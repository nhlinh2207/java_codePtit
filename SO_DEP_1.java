package codePtit;

import java.util.*;

public class Test {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        while(n > 0){
            int c = 0;
            String str  = s.nextLine();
            List<String> a = new ArrayList<>(Arrays.asList(str.split("")));
            for (String i: a){
                if(Integer.parseInt(i) %2 ==1){
                    c++;
                    break;
                }
            }
            if(c==0) System.out.println("YES");
            else System.out.println("NO");
            n--;
        }
    }
}
