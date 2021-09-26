package codePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String birth;
        private String bd;
        private String kt;
        private int tuoi;
        private int uutien;
        private int loai;
        private String tgthucte;
        private String tguutien;
        private String tgtong;
        private long realseconds;

        public sv(){}

        public void nhap(Scanner s){
            s.nextLine();
            name = s.nextLine();
            birth = s.next();
            bd = s.next();
            kt = s.next();
        }

        public void setMa(int a){
            ma = (a<10) ? "VDV0"+a :"VDV"+a;
        }

        public void setTuoi(){
            tuoi = 2021 - Integer.valueOf(birth.split("/")[2]);
        }

        public void setUutien() {
            if (tuoi < 18)
                uutien = 0;
            else if (tuoi >= 18 && tuoi < 25)
                uutien = 1;
            else if (tuoi >= 25 && tuoi < 32)
                uutien = 2;
            else uutien = 3;
        }

        public void setLoai(int a){
            loai = a;
        }

        public void setTgthucte(){
            String start[] = bd.split(":");
            String end[] = kt.split(":");
            long totaltime = (Integer.valueOf(end[0])*3600 + Integer.valueOf(end[1])*60 + Integer.valueOf(end[2])) - (Integer.valueOf(start[0])*3600 + Integer.valueOf(start[1])*60 + Integer.valueOf(start[2]));
            long h = 0, m=0,s=0;
            h = totaltime/3600;
            totaltime -= h*3600;
            m = totaltime/60;
            totaltime -= m*60;
            s = totaltime;
            String hs = (h<10)? "0"+Long.toString(h): Long.toString(h);
            String ms = (m<10)? "0"+Long.toString(m): Long.toString(m);
            String ss = (s<10)? "0"+Long.toString(s): Long.toString(s);
            tgthucte = hs+":"+ms+":"+ss;
        }

        public void setTguutien(){
            tguutien = "00:00:0"+uutien;
        }

        public void setTgtong(){
            String start[] = bd.split(":");
            String end[] = kt.split(":");
            long totaltime = (Integer.valueOf(end[0])*3600 + Integer.valueOf(end[1])*60 + Integer.valueOf(end[2])) - (Integer.valueOf(start[0])*3600 + Integer.valueOf(start[1])*60 + Integer.valueOf(start[2]));
            totaltime -= uutien;
            long h = 0, m=0,s=0;
            h = totaltime/3600;
            totaltime -= h*3600;
            m = totaltime/60;
            totaltime -= m*60;
            s = totaltime;
            String hs = (h<10)? "0"+Long.toString(h): Long.toString(h);
            String ms = (m<10)? "0"+Long.toString(m): Long.toString(m);
            String ss = (s<10)? "0"+Long.toString(s): Long.toString(s);
            tgtong = hs+":"+ms+":"+ss;
        }

        public void setRealseconds(){
            String start[] = bd.split(":");
            String end[] = kt.split(":");
            long totaltime = (Integer.valueOf(end[0])*3600 + Integer.valueOf(end[1])*60 + Integer.valueOf(end[2])) - (Integer.valueOf(start[0])*3600 + Integer.valueOf(start[1])*60 + Integer.valueOf(start[2]));
            totaltime -= uutien;
            realseconds = totaltime;
        }

        public long getRealseconds(){return realseconds;}

        public int getLoai(){return loai;}

        public void xuat(){
            System.out.println(ma + " " + name + " " + tgthucte + " "+ tguutien + " " + tgtong + " " + loai);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        int c = 1;
        int n = s.nextInt();
        List<sv> res = new ArrayList<>();
        while (n-->0) {
            sv a = new sv();
            a.nhap(s);
            a.setMa(c);
            a.setTuoi();
            a.setTgthucte();
            a.setUutien();
            a.setTguutien();
            a.setTgtong();
            a.setRealseconds();
            res.add(a);
            c++;
        }
        List<sv> temp = res.stream().sorted(Comparator.comparing(sv::getRealseconds)).collect(Collectors.toList());
        int hang = 1;
        int count = 1;
        temp.get(0).setLoai(hang);
        for (int i = 1;i<temp.size();i++){
            if (temp.get(i).getRealseconds() == temp.get(i-1).getRealseconds()) {
                temp.get(i).setLoai(hang);
                count++;
            }else{
                hang = count+1;
                temp.get(i).setLoai(hang);
                count++;
            }
        }
        Collections.sort(res, Comparator.comparing(sv::getLoai));
        for (sv i: res){
            i.xuat();
        }
    }
}
