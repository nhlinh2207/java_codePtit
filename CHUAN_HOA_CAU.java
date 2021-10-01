package codePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()){
            String res = s.nextLine().toLowerCase();
            res = res.replaceAll("\\s*\\?\\s*", "\\? ");
            res = res.replaceAll("\\s*\\!\\s*", "\\! ");
            res = res.replaceAll("\\s*\\:\\s*", "\\: ");
            res = res.replaceAll("\\s*\\,\\s*", "\\, ");
            res = res.replaceAll("\\s*\\.\\s*", "\\. ");
            res = res.replaceAll("\\s+", " ");
            res = Character.toUpperCase(res.charAt(0))+res.substring(1,res.length());
            if (res.charAt(res.length() - 1) == ' '){
                res = new StringBuilder(res).deleteCharAt(res.length() - 1).toString();
            }
            for (int i = 0;i<res.length();i++){
                if(i<res.length()-2) {
                    if (res.charAt(i) == '.' || res.charAt(i) == '!' || res.charAt(i) == '?') {
                        res = res.substring(0, i + 2) + Character.toUpperCase(res.charAt(i + 2)) + res.substring(i + 3, res.length());
                    }
                }
            }
            if (res.charAt(res.length() - 1) != '!' && res.charAt(res.length() - 1) != '?' && res.charAt(res.length() - 1) != '.')
                res = res+".";
            System.out.println(res);
        }

    }
}