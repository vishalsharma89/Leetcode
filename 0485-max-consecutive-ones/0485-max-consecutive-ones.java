class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int one=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                one++;
            }else{
                one=0;
            }
            maxi = Math.max(maxi,one);
        }
        return maxi;
    }
}