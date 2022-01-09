package codePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Test {
    static class sv{
        private String ho;
        private String ten;
        private String full;

        public sv(String a, String b, String c){
            ho = a;
            ten = b;
            full = c;
        }

        public String getHo() {
            return ho;
        }

        public void setHo(String ho) {
            this.ho = ho;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getFull() {
            return full;
        }

        public void setFull(String full) {
            this.full = full;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("DATA.in"));
        Integer temp = Integer.valueOf(s.nextLine());
        List<String> ten = new ArrayList<>();
        List<String> rutgon = new ArrayList<>();
        while (temp -- > 0){
            ten.add(s.nextLine());
        }
        Integer b = Integer.valueOf(s.nextLine());
        while (b --> 0){
            rutgon.add(s.nextLine());
        }
        List<String> res = new ArrayList<>();
        for (String i : rutgon){
            String[] ten1 = i.split("\\.");
            for (String k : ten){
                int c = 0;
                String[] ten2 = k.split(" ");
                for (int j = 0;j<ten2.length; j++){
                    if (ten1[j].equals(String.valueOf(ten2[j].charAt(0))))
                        c++;
                }
                if (c == new ArrayList<String>(Arrays.asList(ten1)).stream().filter( p -> !p.equals("*")).count())
                    res.add(k);
            }
        }
        List<sv> temp2 = new ArrayList<>();
        for (String i: res){
            String e[] = i.split(" ");
            temp2.add(new sv(e[0], e[e.length -1], i));
        }
        Collections.sort(temp2, Comparator.comparing(sv::getHo));
        Collections.sort(temp2, Comparator.comparing(sv::getTen));
        for (sv i : temp2){
            System.out.println(i.getFull());
        }
    }
}