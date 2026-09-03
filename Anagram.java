import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "nayan";
        String t = "naayn";
        if (s.length() != t.length()) {
            System.out.println("Not Anagram");
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b)){
            System.out.println("It is an Anagram");
        }
    }
}
