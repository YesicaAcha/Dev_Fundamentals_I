/**
 * Checking whether two arrays contain a mismatch.
 */
public class MismatchExercise {

    public static void main(String[] args) {
        int[] firstTestArrayOne = {1, 2, 3, 4, 5, 6};
        int[] firstTestArrayTwo = {1, 2, 3, 4, 5, 6};

        int resultFirstTest = mismatch(firstTestArrayOne, firstTestArrayTwo);
        System.out.println(resultFirstTest); //result should be -1


        int[] secondTestArrayOne = {1, 2, 3, 4, 5, 6};
        int[] secondTestArrayTwo = {1, 2, 3, 4, 2, 6};

        int resultSecondTest = mismatch(secondTestArrayOne, secondTestArrayTwo);
        System.out.println(resultSecondTest); //result should be 4
    }

    /**
     * Evaluates if two arrays contain a mismatch.
     * Both arrays should have the same length.
     *
     * @param firstArray - First int array;
     * @param secondArray - Second int array;
     * @return -1 if there is not a mismatch or the index of the first mismatch between the two given arrays.
     */
    public static int mismatch(int[] firstArray, int[] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return i;
            }
        }
        return -1;
    }
}