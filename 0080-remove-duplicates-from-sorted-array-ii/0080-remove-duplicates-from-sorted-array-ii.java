class Solution {
    public int removeDuplicates(int[] nums) {
         int cnt =2;
        int n = nums.length;
        for(int i=2;i<n;i++){
            if(nums[cnt-2]!=nums[i] ){
               nums[cnt]=nums[i];
               cnt++;
            }
        }
        return cnt;
    }
}