class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

    int low = 1, high = x, ans = 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;

        if ((long) mid * mid <= x) {
            ans = mid;         // candidate
            low = mid + 1;     // search right
        } else {
            high = mid - 1;    // search left
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