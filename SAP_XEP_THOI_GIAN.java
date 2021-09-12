package codePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    static class Time{
        private int hour;
        private int minute;
        private int second;
        public void nhap(Scanner scanner){
            hour = scanner.nextInt();
            minute = scanner.nextInt();
            second = scanner.nextInt();
        }
        public void in(){
            System.out.println(hour+" "+minute+" "+second);
        }
        public int getTime(){
            return hour*60*60+minute*60+second;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Time> res = new ArrayList<>();
        while(n-->0){
            Time t = new Time();
            t.nhap(s);
            res.add(t);
        }
        Collections.sort(res, Comparator.comparing(Time::getTime));
        for (Time i: res){
            i.in();
        }
    }
}
