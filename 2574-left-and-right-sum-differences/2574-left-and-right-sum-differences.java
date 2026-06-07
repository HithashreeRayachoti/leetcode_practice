class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len=nums.length;
        int[] right=new int[len];
        int r=0,l=0;
        int[] left=new int[len];
        int[] ans=new int[len];
        if(len==1)
        {
            ans[0]=0;
            return ans;
        }
        else
        {
        for(int i=0;i<len;i++)
        {
            for(int x=i+1;x<len;x++)
            {
                if(i==len-1)
                {
                    right[i]=0;
                    continue;
                }
                right[i]+=nums[x];
            }
             if(i==0)
                {
                    left[i]=0;
                    continue;
                }
            for(int x=i-1;x>=0;x--)
            {
               
                left[i]+=nums[x];
            }
            

        }
        }
        
        for(int j=0;j<len;j++)
        {
            ans[j]=Math.abs(left[j]-right[j]);
        }
        return ans;
    }
}