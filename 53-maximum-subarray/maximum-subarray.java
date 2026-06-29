class Solution {
    public int maxSubArray(int[] nums) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i : nums) {
            currentSum += i;
            maxSum = Math.max(currentSum, maxSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}