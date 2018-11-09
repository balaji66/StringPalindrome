import java.util.Scanner;

public class StringPalindrome {
    private String mFirstString;
    private String input() {
        System.out.println("Enter string : ");
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        mFirstString = s;
        return s;
    }
    private void reverseString(String string) {
        String reverse ="";
        for(int i = string.length()-1;i>=0; i--)
        {
            reverse = reverse.concat(String.valueOf(string.charAt(i)));
        }
        if(mFirstString.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }

    }

    public static void main(String [] args) {

        StringPalindrome rs = new StringPalindrome();
        rs.reverseString(rs.input());
            }
}
