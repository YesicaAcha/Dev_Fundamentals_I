/**
 * Check if a string is a palindrome.
 */
public class Exercise3 {

    /**
     * Evaluates if a string is palindrome.
     * 
     * @param string - String to evaluate.
     * @return True if the string is palindrome, false otherwise.
     */
    private static boolean isPalindrome(final String string) {
        int start = 0;
        int end = string.length() - 1;

        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
 
    public static void main(String[] args) {
        String string = System.console().readLine("Enter the string to evaluate: ");
        System.out.println("The string \"" + string + "\" is " + (isPalindrome(string) ? "": "not") + " palindrome.");
    }        
}