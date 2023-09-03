class Solution 
{
    public List<List<Integer>> combinationSum2(int[] cand, int target) 
    {
        Arrays.sort(cand);
        List<List<Integer>> r = new ArrayList();
        find(r, cand, target, 0, new ArrayList());
        
        return r;
    }
    
    void find(List<List<Integer>> result, int[] cand, int target, int start, List<Integer> cur)
    {
        if (target == 0)
        {
            result.add(new ArrayList(cur));
            return;
        }
        
        for (int i = start; i < cand.length; ++i)
        {
            if (cand[i] <= target)
            {
                if (i == start || cand[i] != cand[i-1])
                {
                    int pos = cur.size();
                    cur.add(cand[i]);
                    find(result, cand, target - cand[i], i + 1, cur);
                    cur.remove(pos);
                }
            }
            else break;
        }
    }
}