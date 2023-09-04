class Solution {
    public int longestPalindrome(String s) {
        int[] char_counts=new int[128];
        for(char a:s.toCharArray())
        {
            char_counts[a]++;
        }
        int result=0;
        for(int a:char_counts)
        {
            result+=a/2 *2;
            if(result%2==0 && a%2==1)
            {
                result+=1;
            } 
        }
        return result;
    }
}
