class Solution {
    public int maxArea(int[] height) {
        // int maxWater=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int width = j-i;
        //         int ht = Math.min(height[i],height[j]);
        //         int area = width * ht;

        //         maxWater = Math.max(maxWater, area);
        //     }
        // }
        // return maxWater;
        int maxWater=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
                int width = rp-lp;
                int ht = Math.min(height[lp],height[rp]);
                int area = width * ht;
                maxWater = Math.max(maxWater, area);
                if(height[lp]<height[rp]){
                    lp++;
                }else{
                    rp--;
                }
            //    height[lp]<height[rp] ? lp++:rp--;
        }
        return maxWater;
    }
}