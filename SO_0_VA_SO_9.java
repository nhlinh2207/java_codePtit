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
            int a = s.nextInt();
            String p = "9";
            List<String> res = new ArrayList<>();
            res.add(p);
            while(Integer.valueOf(res.get(0)) % a !=0){
                String t1 = res.get(0)+"0";
                String t2 = res.get(0)+"9";
                res.add(t1); res.add(t2);
                res.remove(0);
            }
            System.out.println(res.get(0));
        }
    }

}
