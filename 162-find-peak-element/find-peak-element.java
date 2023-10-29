class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(0 == n) return -1;
        if(1 == n) return 0;
        if(2 == n) return nums[0] > nums[1] ? 0 : 1;       
        int low = 0, high = n - 1;
        while(low + 2 <= high)
        {
            int mid = low + (high - low) / 2;            
            if(nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1])
                return mid;
            if(nums[mid - 1] > nums[mid])
                high = mid;
            else
                low = mid;
        }
        return nums[low] > nums[high] ? low : high;
    }
}