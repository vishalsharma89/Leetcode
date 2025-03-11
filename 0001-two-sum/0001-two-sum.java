class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int a;
        // int b;
        int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             a = i;
        //             b = j;
        //             return new int[]{a, b};
        //         }
        //     }
        // }
        // return new int[]{};
        Map<Integer, Integer> mpp = new HashMap<>();
        
        for(int i=0;i<n;i++){
            int num = nums[i];
            int more = target- num;

            if(mpp.containsKey(more)){
                return new int[]{i,mpp.get(more)};
            }
            mpp.put(num, i);
        }

        return new int[]{};

    }
}