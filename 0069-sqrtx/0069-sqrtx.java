class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int ans =1;
        int low =1;
        int high = x;
        
        while(low<=high){
            int mid = low +(high-low)/2;
            if((long)mid*mid<=x){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    //     if (x < 2) return x;

    // // int ans = 1;
    // // for (int i = 1; i <= x / 2; i++) {
    // //     if ((long) i * i <= x) {
    // //         ans = i;
    // //     } else {
    // //         break;
    // //     }
    // // }
    // // return ans;
    }
}