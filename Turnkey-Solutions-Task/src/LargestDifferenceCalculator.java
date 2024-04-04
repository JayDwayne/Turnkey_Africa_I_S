public class LargestDifferenceCalculator {

    public static int largestDifference(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int minNum = nums[0];
        int maxDiff = 0;

        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxDiff = Math.max(maxDiff, num - minNum);
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] input = {1, 9, 3, 7};
        int result = largestDifference(input);
        System.out.println("The largest difference is: " + result);
    }
}
