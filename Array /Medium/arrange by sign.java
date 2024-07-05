class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int po=0;
        int ne=1;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                res[ne]=nums[i];
                ne+=2;
            }
            else
            {
                res[po]=nums[i];
                po+=2;
            }
        }
        return res;
    }
}
