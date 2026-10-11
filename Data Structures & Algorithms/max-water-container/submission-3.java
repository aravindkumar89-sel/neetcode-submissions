class Solution {
    public int maxArea(int[] heights) {
        int finalArea = 0;
        int left = 0;
        for (int i = 0; i < heights.length; i++) {
            //System.out.println("heights[i]: " + heights[i]);
            if (heights[i] <= left) {
                continue;
            }
            left = heights[i];
            int right = 0;
            //System.out.println("left: " + left);
            for (int j = heights.length - 1; j >= 0; j--) {
                if (i > j) {
                    break;
                }
                //System.out.println("heights[j]: " + heights[j]);
                if (heights[j] <= right) {
                    continue;
                }

                int currentArea = Math.min(left, heights[j]) * (j - i);
                //System.out.println("right: " + right + " currentArea: " + currentArea
                    //+ " finalArea: " + finalArea);
                if (currentArea > finalArea) {
                    finalArea = currentArea;
                    right = heights[j];
                }
            }
        }

        return finalArea;
    }
}
