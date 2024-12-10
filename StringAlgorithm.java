import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringAlgorithm {
    private static File f;
    private static Scanner s;

    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoletter = twoletter();
        System.out.println (twoletter);
        int longestword = longestword();
        System.out.println (longestword);
        int palindromes = palindromes();
        System.out.println(palindromes);
        s.close();

    }

    public static int twoletter() throws FileNotFoundException {
        s = new Scanner(f);
        int twoletter = 0;
        while (s.hasNext()) {
        String word = s.next();
            if (word.length()==2)
                twoletter++;
        }
        return twoletter;
    }
    public static int longestword() throws FileNotFoundException {
        s = new Scanner(f);
        int count= 1; 
        int j = 0;
        while (s.hasNext()) {
        String word = s.nextLine();
           if (word.length()>j) {
            j=word.length();
           }
        }
        while(s.hasNext()) {
            String nextword =s.next();
            if (nextword.length()==j) {
                count++;
            }
        }
        return count;
        
    }
    public static int palindromes() throws FileNotFoundException {
        s = new Scanner(f);
        int num= 0; 
        while (s.hasNext()) {
            String nextword = s.nextLine();
            String str="";
           for (int k =0 ; k < nextword.length();k++) {
            str= nextword.substring(k,k+1) + str;
           }
           if (nextword.equals(str)) {
            num++;
           }
        }
        return num;
        
    }
    
}