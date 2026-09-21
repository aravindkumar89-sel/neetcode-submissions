class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    sum = sum * nums[j];
                }
            }
            sums[i] = sum;
        }

        return sums;
    }
}
