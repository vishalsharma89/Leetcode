class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        int l,r;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                sum+=nums[i]+nums[j];
                if(nums[i]+nums[j]==target){
                                        return new int[]{i, j};

                }
            }
        }
                            return new int[]{};

    }
}