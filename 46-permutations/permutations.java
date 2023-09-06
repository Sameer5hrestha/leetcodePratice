class Solution {
    
    void permutation(List<List<Integer>> result,List<Integer> permute,int[] nums){
        if(permute.size()==nums.length){
             result.add(new ArrayList<>(permute));
            return;
        }
           
        for(int j=0;j<nums.length;j++){
            if(permute.contains(nums[j])) continue;
            permute.add(nums[j]);
            permutation(result,permute,nums);
            permute.remove(permute.size()-1);
            
        }
       
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> permute = new ArrayList<>();
        permutation(result,permute,nums);
        return result;
    }
}