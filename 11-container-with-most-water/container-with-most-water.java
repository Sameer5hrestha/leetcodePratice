class Solution
{
    public int maxArea(int[] height)
	{
        int maxArea = 0;
		int start = 0;
		int end = height.length - 1;
        
		while(start < end)
		{
            int length = Math.min(height[start], height[end]);
			int width = end - start;
			int curArea =  length * width;
			maxArea = Math.max(maxArea, curArea);
			
            while(start < end && height[start] <= length) start++;
            while(start < end && height[end] <= length)   end--;
        }
        return maxArea;
    }
}