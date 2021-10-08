package codePtit;
import java.util.*;

public class Test {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int p = s.nextInt();
       while (p -- > 0) {
           int n = s.nextInt();
           int a[][] = new int[n][n];
           for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++)
                   a[i][j] = s.nextInt();
           }
           for (int i = 0; i < n; i++) {
               if (i % 2 == 0) {
                   for (int j = 0; j < n; j++) {
                       System.out.print(a[i][j] + " ");
                   }
               } else {
                   for (int j = n - 1; j >= 0; j--) {
                       System.out.print(a[i][j] + " ");
                   }
               }
           }
           System.out.println();
       }
    }
}