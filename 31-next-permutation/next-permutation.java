import java.util.Arrays;
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==-1){
            Arrays.sort(nums);
            return ;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[ind];
                nums[ind]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        Arrays.sort(nums,ind+1,n);
        

    }
}