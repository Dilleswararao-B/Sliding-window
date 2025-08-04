class Solution {
       public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    private int atMost(int[] nums, int goal) {
        if(goal<0)
        {
            return 0;
        }
        int sum=0,l=0,count=0;
        int n=nums.length;
        for(int r=0;r<n;r++)
        {
           sum += nums[r];

        while (sum > goal) {
            sum -= nums[l++];
           
        }

        count += r - l + 1; 
    }

    return count;
}
}