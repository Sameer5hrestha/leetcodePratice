
class Solution {
    static int hash(String input) {
        int hash = 0;
        
        for(char c : input.toCharArray())
             hash|=1<<(c-'a');
    
        return hash;
    }
    public int maxProduct(String[] words) {
        int max = 0;
        int dp[] = new int[words.length];
        for(int i=0;i<words.length;i++) {
            dp[i] = Solution.hash(words[i]);
        }
        for(int i=0;i<words.length;i++) {
            for(int j=i+1;j<words.length;j++) {
                int hash1 = dp[i];
                int hash2 = dp[j];
                if((hash1 & hash2)==0 && (words[i].length()*words[j].length()>max)) {
                    max = words[i].length()*words[j].length();
                }
            }
        }
        return max;
    }
}