class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // sort the array
        Arrays.sort(nums);

        // intitalize closestSum with the sum of the first three elements
        // this gives us a starting point to compare against.
        int closestSum = nums[0]+nums[1]+nums[2];

        // Loop through the array with 'i' pointer
        // we go up to nums.length-2 beacuse we need at least two elemnts for left and right.
        for(int i=0;i<nums.length-2;i++){

            // step 3: Set up the left and right pointers
            int left = i+1;
            int right = nums.length-1;

        // Use the two-pointer startegy to find the best pair for nums[i].
            while(left<right){

                // Calculate the sum of the current triplet.
                int currSum = nums[i] + nums[left]+ nums[right];

        // if we found the exact target, it's the best possible answer
                if(Math.abs(currSum - target)<Math.abs(closestSum - target)){
                    closestSum = currSum;
                }

        // if current sum == target, return immediately (best possible match)
                if(currSum == target){
                    return target;
                }

        // if currSum>target, move right--to decrease
                else if(currSum>target){
                    right--;
                }

        // /if currSum<target, move left++ to increase the sum
                else{
                    left++;
                }
            }
        }
            return closestSum;
    }
}