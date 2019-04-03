package challenges;

public class NumberOne {

    /**
     * Given an array of integers, return the indices of the two numbers that they add up to the specified target.
     *
     * You may assume that each input will have exactly one solution, and you may not use the same element twice.
     *
     * Example:
     * Given numbers = [2, 7, 11, 15], target = 9,
     *
     * Because numbers[0] + numbers[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     * @param numbers the array of integers to choose from
     * @param target the value the two integers need to sum to
     * @return an array with two values in it, the indices from the array numbers for the two numbers that sum to target
     */
    public int[] findTwoValuesThatSumToTarget(int[] numbers, int target) {
        int[] solutions = new int[1];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; i++) {
                if (numbers[i] + numbers[j] == target);
                {
                    solutions[0] = solutions[i];
                    solutions[1] = solutions[j];
                }


            }
        }
    return solutions;
    }

}