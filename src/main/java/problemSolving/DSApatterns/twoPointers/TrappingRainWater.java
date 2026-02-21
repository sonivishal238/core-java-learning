package problemSolving.DSApatterns.twoPointers;

/*
https://algomaster.io/learn/dsa/trapping-rain-water for explanation
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        int left = 0, right = height.length-1, leftMax = 0, rightMax = 0;
        int waterCollected = 0;

        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] < leftMax) {
                    waterCollected+= leftMax - height[left];
                } else {
                    leftMax = height[left];
                }

                left++;

            } else {
                if(height[right] < rightMax) {
                    waterCollected += rightMax-height[right];
                } else {
                    rightMax = height[right];
                }

                right--;
            }

        }
        return waterCollected;
    }
}
