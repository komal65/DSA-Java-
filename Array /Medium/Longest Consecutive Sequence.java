class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        Arrays.sort(nums);
        int maxi=0;
        int c=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] != nums[i-1])
            {
                if(nums[i]-nums[i-1]==1)
                {
                    c++;
                }
                else
                {
                    maxi= Math.max(maxi ,c);
                    c=1;
                }
            }
            
        }
        return Math.max(c, maxi);
    }
}
