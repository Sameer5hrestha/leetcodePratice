	class Solution {
    public int wiggleMaxLength(int[] nums) {
         int n = nums.length,peak = 1,valley = 1;
        for(int i = 0; i<n-1; i++){
            if(nums[i]>nums[i+1]){
                peak = valley+1;
            }
            else if(nums[i]<nums[i+1]){
                valley = peak+1;
            }
        }
        return Math.max(valley,peak);
    
    }
}