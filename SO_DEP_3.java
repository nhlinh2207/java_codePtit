package codePtit;


import java.util.*;

public class Test {
    public static int tn(List<String> a){
        int l = 0, r = a.size()-1;
        while(l <= r){
            if(Integer.parseInt(a.get(l)) != Integer.parseInt(a.get(r)))
                return 0;
            l++; r--;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        while(n > 0){
            int c = 0;
            String str  = s.nextLine();
            List<String> a = new ArrayList<>(Arrays.asList(str.split("")));
            for (int i = 0;i<a.size();i++){
                if(!a.get(i).equals("3") && !a.get(i).equals("7") && !a.get(i).equals("5") && !a.get(i).equals("2"))
                {
                    c++;
                    break;
                }
            }
            if(c == 0 && tn(a) == 1) System.out.println("YES");
            else System.out.println("NO");
            n--;
        }
    }
}
