class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product=new int[nums.length];
        int prod=1;
        int count0=0;
        int prodj=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            prod*=nums[i];
             prodj*=nums[i];
            }
            else{
                prod*=nums[i];
                count0++;
            }
            
        }
          for(int i=0;i<nums.length;i++){
              if(nums[i]!=0)
              product[i]=prod/nums[i];
              else if(count0>1)
              product[i]=0;
              else if(count0==1 && product[i]==0) 
              product[i]=prodj;

          }
          return product;
    }
}