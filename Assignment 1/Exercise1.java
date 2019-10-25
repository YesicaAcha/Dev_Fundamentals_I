/**
  * Given an integer 'n', return the largest number that contains exactly 'n' digits.
  * Example
  * For 'n = 2', the output should be 'largestNumber(n) = 99'.
  * Input/Output
  */
 public class Exercise1 {

    /**
     * Calculates the largest number with that contains the quantity of digits received in the parameter.
     * 
     * @param numberOfDigits - Quanitty of digits of the largest number.
     * @return the largest number.
     */
    private static int calculateLargestNumberByNumberOfDigits(final int numberOfDigits) {
        return (int) Math.pow(10, numberOfDigits) - 1;
    }
 
    public static void main(String[] args) {
        int numberOfDigits = Integer.parseInt(System.console().readLine("Enter number of digits: "));
        System.out.println("The largest number that contains exactly " + numberOfDigits + " digits is: " 
            + calculateLargestNumberByNumberOfDigits(numberOfDigits));
    }
 }