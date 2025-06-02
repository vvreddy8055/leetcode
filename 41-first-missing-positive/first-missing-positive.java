class Solution {
    public int firstMissingPositive(int[] nums) 
    {
        int len = nums.length;
        boolean[] vis = new boolean[len];

        for(int n : nums)
        {
            if(n < 1 || n > len)
                continue;
            else 
                vis[n-1] = true;
        }

        for(int i = 0; i < len; i++)
        {
            if(!vis[i])
                return i+1;
        }

        return len+1;
    }
}