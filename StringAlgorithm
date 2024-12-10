public class StringAlgorithm {
    private static File f;
    private static Scanner s;

    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoletter = twoletter();
        System.out.println (twoletter);
        int longest = longest();
        System.out.println (longest);
        int palindromes = palindromes();
        System.out.println(palindromes);
        s.close();

    }

    public static int twoletter() throws FileNotFoundException {
        s = new Scanner(f);
        int twoletter = 0;
        while (s.hasNext()) {
            if (s.next().length==2)
                twoletter++;
        }
        return twoletter;
    }
    public static int longest() throws FileNotFoundException {
    s = new Scanner(f);
    int [] words = new String;
    int [] final = new String;
    int count == 0;
    while(s.next())
    {
        words[s.next()]++;
    }
    String greatestword = "";
    for(int i = 1; i < words.length; i++)
    {
        if (words[i].length>count)
        {
            great= i;
            final[words[i]]++;
        }
    }
    return final.length;
}
public static String reverse(Str) throws FileNotFoundException {
    int a = str.length();
    String result = "";
    for (int i = a ; i<1; i--) {
        result = str.substring(i-1,i) + result;
    }
    return result;
}


public static int palindromes() throws FileNotFoundException {
    s= new Scanner(f);
    int count = 0
    while (s.hasNext()) { 
        String word = s.hasNext();
        if (s.reverse(word).equals(word)){
            count ++ ;
        }
    }
    return count; 
}
    
}