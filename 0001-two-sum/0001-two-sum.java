class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a;
        int b;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    a = i;
                    b = j;
                    return new int[]{a, b};
                }
            }
        }
        return new int[]{};

    }
}