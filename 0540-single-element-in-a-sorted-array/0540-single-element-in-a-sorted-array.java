class Solution {
    public int singleNonDuplicate(int[] arr) {
        // }
        int n=arr.length;
        // int ans = 0;
        // for(int i=0;i<n;i++){
        //     ans = ans ^ arr[i];
        // }
        // return ans;
        
     if(n==1){
            return arr[0];
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(arr[i]!=arr[i+1]){
                return arr[i];
            }
            }
            else if(i==n-1){
                if(arr[i]!=arr[i-1]){
                return arr[i];
            }
            }
            else{
                if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                return arr[i];
            }
            }
        }
        return -1;

    }
}