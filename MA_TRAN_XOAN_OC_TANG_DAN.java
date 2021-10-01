package codePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        List<Integer> res = new ArrayList<>();
        int t = s.nextInt();
        for (int i = 0;i < t*t; i++){
            res.add(s.nextInt());
        }
        Collections.sort(res);
        int a[][] = new int[t][t];
        int j = 0, k = 1, p = 0, dong = t, cot = t;
        ex: while (k <= t*t){
            for (int i = p;i< cot;i++){
                a[p][i] = res.get(j);
                j++;
                if (j == t*t)
                    break ex;
                k++;
            }
            for (int i = p+1; i< dong; i++){
                a[i][cot-1] = res.get(j);
                j++;
                if (j == t*t)
                    break ex;
                k++;
            }
            for (int i = cot-2; i>= p ;i--){
                a[dong-1][i] = res.get(j);
                j++;
                if (j == t*t)
                    break ex;
                k++;
            }
            for (int i = dong-2; i>p; i--){
                a[i][p] = res.get(j);
                j++;
                if (j == t*t)
                    break ex;
                k++;
            }
            p++;
            cot--;
            dong--;
        }
        for (int i = 0;i<t;i++){
            for (int u = 0;u<t;u++){
                System.out.print(a[i][u]+" ");;
            }
            System.out.println();
        }
    }
}