package codePtit;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class sv{
        private String ma;
        private String name;
        private String clas;
        private String email;

        public sv(){}

        public void nhap(Scanner s){
            ma = s.next();
            s.nextLine();
            name = s.nextLine();
            clas = s.next();
            email = s.next();
        }

        public String getMa(){return ma;}
        public String getClas(){ return clas;}
        public String getName(){return name;}
        public String getEmail(){return email;}
        public void xuat(){
            System.out.println(this.getMa()+" "+this.getName()+" "+this.getClas()+" "+this.getEmail());
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<sv> res = new ArrayList<>();
        while(n-->0){
            sv i = new sv();
            i.nhap(s);
            res.add(i);
        }
        int q = s.nextInt();
        s.nextLine();
        while(q-->0){
            String khoa = s.nextLine();
            if (khoa.equalsIgnoreCase("ke toan")){
                System.out.println("DANH SACH SINH VIEN NGANH "+khoa.toUpperCase()+": ");
                for (sv i: res){
                    if (i.getMa().substring(3,7).equals("DCKT"))
                        i.xuat();
                }
            }else if(khoa.equalsIgnoreCase("dien tu")){
                System.out.println("DANH SACH SINH VIEN NGANH "+khoa.toUpperCase()+": ");
                for (sv i: res){
                    if (i.getMa().substring(3,7).equals("DCDT"))
                        i.xuat();
                }
            }else if(khoa.equalsIgnoreCase("vien thong")){
                System.out.println("DANH SACH SINH VIEN NGANH "+khoa.toUpperCase()+": ");
                for (sv i: res){
                    if (i.getMa().substring(3,7).equals("DCVT"))
                        i.xuat();
                }
            }else if(khoa.equalsIgnoreCase("cong nghe thong tin")){
                System.out.println("DANH SACH SINH VIEN NGANH "+khoa.toUpperCase()+": ");
                for (sv i: res){
                    if (i.getMa().substring(3,7).equals("DCCN") && !i.getClas().startsWith("E"))
                        i.xuat();
                }
            }else if(khoa.equalsIgnoreCase("an toan thong tin")){
                System.out.println("DANH SACH SINH VIEN NGANH "+khoa.toUpperCase()+": ");
                for (sv i: res){
                    if (i.getMa().substring(3,7).equals("DCAT") && !i.getClas().startsWith("E"))
                        i.xuat();
                }
            }

        }
    }
}