class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int count=0;
     int maxCOunt =0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            count++;
            maxCOunt = Math.max(count,maxCOunt);
        }
        else {
            count =0;
        }
     }   
     return maxCOunt;
    }
}