package codePtit;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Test{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-->0){
            String t  = s.next();
            int m = 0;
            List<Integer> list = new ArrayList<>();
            list.add(-1);
            for (int i = 0;i<t.length();i++){
                if (t.charAt(i) == '(')
                    list.add(i);
                else{
                    list.remove(list.size()-1);
                    if (!list.isEmpty())
                        m = Math.max(m, i-list.get(list.size() - 1));
                    else
                        list.add(i);
                }
            }
            System.out.println(m);
        }
    }

}
