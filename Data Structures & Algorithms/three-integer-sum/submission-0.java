class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> finalLst = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
             if (nums[i] > 0) {
                break;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] > 0) {
                    break;
                }

                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        finalLst.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    } else if (nums[i] + nums[j] + nums[k] > 0) {
                        break;
                    }
                }
            }
        }
        return new ArrayList<>(finalLst);
    }
}
