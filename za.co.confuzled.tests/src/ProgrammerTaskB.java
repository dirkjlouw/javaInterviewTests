/**
 * Ref to document: documents/Java_Tests-FULL.pdf
 */
public class ProgrammerTaskB {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            if (isPalindrome(args[i])) {
                System.out.println(args[i] + " is a Palindrome");
            }
            else {
                System.out.println(args[i] + " is NOT a Palindrome");
            }
        }
    }

    public static boolean isPalindrome(String term) {

        for (int i = 0; i < term.length(); i++) {

            System.out.println(i + " = " + term.substring(0, i + 1));
            System.out.println((term.length() - 1) - i +  " = " + term.substring((term.length() - 1) - i));

            if (term.charAt(i) != term.charAt((term.length() - 1) - i)) {
                return false;
            }

            System.out.println();
        }
        return true;
    }
}
