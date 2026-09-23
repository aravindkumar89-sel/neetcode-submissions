class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        Set<Integer> resultSet = new HashSet<Integer>();
        resultSet.add(nums[0]);

        int finalCount = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length) {
                break;
            }
            if (nums[i + 1] - nums[i] == 0 || nums[i + 1] - nums[i] == 1) {
                resultSet.add(nums[i]);
                resultSet.add(nums[i + 1]);
            } else {
                if (resultSet.size() >= finalCount) {
                    finalCount = resultSet.size();
                }
                resultSet = new HashSet<Integer>();
                resultSet.add(nums[i + 1]);
            }
        }

        return resultSet.size() > finalCount ? resultSet.size() : finalCount;
    }
}