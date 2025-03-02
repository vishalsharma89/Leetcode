class Solution {
    public int removeDuplicates(int[] nums) {
        // int cnt =0;
        // int n = nums.length;
        // for(int i=1;i<n;i++){
        //     if(nums[cnt]!=nums[i]){
        //         cnt++;
        //         nums[cnt]=nums[i];
        //     }
        // }
        // return cnt+1;
         int cnt =1;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[cnt-1]!=nums[i] ){
               nums[cnt]=nums[i];
               cnt++;
            }
        }
        return cnt;
    }
}