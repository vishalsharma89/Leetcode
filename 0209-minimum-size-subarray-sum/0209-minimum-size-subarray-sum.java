class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int minLenWindow = Integer.MAX_VALUE;
       int currentSum = 0;

        // start 2 pointers sliding window.
        int low = 0;
        int high = 0;

        while(high<nums.length){
            // find the current sum and increase the window length
            currentSum += nums[high];
            high++;
            // reducing the window size
            while(currentSum>=target){
                int windowSize = high-low;

                // update minimum length of window
                minLenWindow = Math.min(minLenWindow, windowSize);
                currentSum-=nums[low];
                low++;
            }
            
        }
        return minLenWindow == Integer.MAX_VALUE?0 :minLenWindow;

    }
}