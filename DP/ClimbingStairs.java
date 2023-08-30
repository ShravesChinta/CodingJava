class Solution {
    public int climbStairs(int n) {
        int[] count=new int[n+1];
        return climbStairsMemoization(n, count);
    }

    static public int climbStairsMemoization(int n, int[] count)
    {
        if(n==0)
        return 1;

        if(n<0)
        return 0;

        if(count[n]==0)
        {
            count[n]=climbStairsMemoization(n-1,count)+ climbStairsMemoization(n-2, count);
        }
        return count[n];
    }
}
