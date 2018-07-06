/**
 * Ref to document: documents/Java_Tests-FULL.pdf
 */
public class ProgrammerTaskA {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            try {
                int integerArg = Integer.parseInt(args[0]);

                System.out.println("occurrences of 1: " + getCountOfOnes(integerArg));
            }
            catch (NumberFormatException e) {
                System.out.println(args[i] + " is not an integer.");
            }
        }
    }

    public static int getCountOfOnes(int n) {

        if (n < 1) {
            return 0;
        }

        String binaryRepresentation = Integer.toBinaryString(n);

        System.out.println("binary representation of " + n + " is " + binaryRepresentation);

        return binaryRepresentation.length() - binaryRepresentation.replace("1", "").length();
    }
}
