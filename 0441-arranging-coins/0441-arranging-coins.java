class Solution {

    public int arrangeCoins(int n) {
       //start with 1 or 0
        long start = 1;
        //end with n becuz thats the rows given max
        //for eg in this =>[1,2,3,4,5] == no. of rows array 
        long end = n;

        //initialise the final ans with 0 and keep updtating it
        long ans =0;
    //normal bs
        while(start <= end){
            long mid = start + (end-start)/2;

            /*use the (sum of 1st natural no.s formula)
            cuz we observe that mid*(mid+1)/2 <= n  always 
            therefore this means basically we need to find the max value of mid
            which satisfies the inequality
            */
            long coin = (mid)*(mid+1)/2;
            if(coin>n)
            {
                end = mid-1;
            }
            else {
                start = mid+1;
                //update the ans
                ans = mid;
            }
        }
        return (int)ans;
    }
}