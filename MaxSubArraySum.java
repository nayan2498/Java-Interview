//Kadane's Algorithm

class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, -2, 7, -4 };
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}