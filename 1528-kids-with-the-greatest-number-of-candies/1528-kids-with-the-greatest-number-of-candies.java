class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for(int candy: candies){
            maxCandies = Math.max(candy,maxCandies);
        }
        List<Boolean> res = new ArrayList<>();
        for( int candy: candies){
            // if(){
                res.add(candy + extraCandies >= maxCandies);
            // }
          
        }
        return res;
    }
}