package codePtit;

import java.net.Inet4Address;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long c = s.nextLong();
        Queue<Long> q = new PriorityQueue<>();
        for (long i = 0; i< n;i++){
            q.add(s.nextLong());
        }
        while (c-->0){
            long temp = q.poll();
            temp = -temp;
            q.add(temp);
        }
        List<Long> res = new ArrayList<>(q);
        System.out.println(res.stream().mapToLong(Long::valueOf).sum());
    }
}