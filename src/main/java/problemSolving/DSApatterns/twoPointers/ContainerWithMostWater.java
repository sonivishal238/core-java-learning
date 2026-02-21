package problemSolving.DSApatterns.twoPointers;

/*
Container With Most Water
Problem
Given height[], find two lines that together hold the maximum water.
Area formula:
area = min(height[left], height[right]) * (right - left)
Core Insight (Very Important)
Start:
left = 0
right = n - 1
At each step:
Calculate area.
Move the pointer with the smaller height.
Why move the smaller height?
Because:
Width always decreases.
If you move the taller line, height won't improve.
Only moving the smaller height gives a chance to find a taller line and increase area.
This greedy logic is the entire trick.
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, maxArea = Integer.MIN_VALUE;

        while(left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right-left;

            maxArea = Math.max(maxArea, minHeight*width);

            if(height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }
}
