class Solution {
    public int maxArea(int[] heights) {
        int finalArea = 0;
        int left = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] <= left) {
                continue;
            }
            left = heights[i];
            int right = 0;
            for (int j = heights.length - 1; j >= 0; j--) {
                if (i > j) {
                    break;
                }
                if (heights[j] <= right) {
                    continue;
                }

                int currentArea = Math.min(left, heights[j]) * (j - i);
                if (currentArea > finalArea) {
                    finalArea = currentArea;
                    right = heights[j];
                }
            }
        }

        return finalArea;
    }
}
