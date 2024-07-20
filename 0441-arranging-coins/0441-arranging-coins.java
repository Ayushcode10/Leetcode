class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        long ans =0;
        while(start <= end){
            long mid = start + (end-start)/2;

            long coin = (mid)*(mid+1)/2;
            if(coin>n)
            {
                end = mid-1;
            }
            else {
                start = mid+1;
                ans = mid;
            }
        }
        return (int)ans;
    }
}