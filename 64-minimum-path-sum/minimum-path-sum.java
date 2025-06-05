class Solution {
    private int solve(int[][] grid,int i,int j,int[][] dp){ //Tabulation Done
        if(i<0 || j<0)return 80000000;
        if(i==0 && j==0)return grid[i][j];
        if(dp[i][j]!=-1)return dp[i][j];
        int left=solve(grid,i,j-1,dp);
        int up=solve(grid,i-1,j,dp);
        return dp[i][j]=grid[i][j]+Math.min(left,up);
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int[] a:dp) Arrays.fill(a,-1);
        return solve(grid,n-1,m-1,dp);
    }
}