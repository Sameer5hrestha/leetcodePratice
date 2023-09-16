class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean [][] dp = new boolean[n][n];
        int count = 0;
        for(int k = n -1; k >= 0; k--)
        {
            for(int j = k; j < n; j++)
            {
                if(s.charAt(k) == s.charAt(j) && (j - k < 2 || dp[k+1][j-1]))
                {
                    dp[k][j] = true;
                    count++;
                }
            }
        }
        return count;
    }
}