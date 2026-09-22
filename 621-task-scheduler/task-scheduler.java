class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] count = new int[26];

        for (char task : tasks) {
            count[task - 'A']++;
        }

        int max = 0;

        for (int value : count) {
            max = Math.max(max, value);
        }

        int maxCount = 0;

        for (int value : count) {
            if (value == max) {
                maxCount++;
            }
        }

        int result = (max - 1) * (n + 1) + maxCount;

        return Math.max(result, tasks.length);
    }
}