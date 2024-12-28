class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        
        // for(int i=0;i<n;i++){
        //     if((i==0 || arr[i]>arr[i-1]) && (i==n-1 || arr[i]>arr[i+1])){
        //         return i;
        //     }
        // }
        // return -1;

        int s=0;
        int e=n-1;
        while(s<e){
            int m=(s+e)/2;
            if(arr[m]<arr[m+1]){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        return s;
    }
}