/**
 * Minimum, maximum, and average of an int array.
 *
 * Example
 * {1, 2, 3, 4, 5, 6, 7}
 *
 * //Result:
 * Min Value:      1
 * Max Value:      7
 * Average Value:  4
 */
public class Exercise4 {

    /**
     * Calculates the minimum, maximum and average on an int array and print the values.
     *
     * @param numbers - Numbers to evaluate.
     */
    private static void calculateMinimumMaximumAverage(final int[] numbers) {
        int minNumber = numbers[0];
        int maxNumber = numbers[0];
        int sum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            } else if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
            sum = sum + numbers[i];
        }

        StringBuilder result = new StringBuilder("The minimum number of the array is: ").append(minNumber)
                .append("\nThe maximum number of the array is: ").append(maxNumber)
                .append("\nThe average of the array is: ").append(sum / (numbers.length - 1));

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        calculateMinimumMaximumAverage(numbers);
    }
}