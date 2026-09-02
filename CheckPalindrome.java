public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "nayanerererttttttt";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("yes it is Palindrome");
        }else{
            System.out.println("No it is not a Palindrome");
        }
    }
}
