class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int current = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (current == nums[j]) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}