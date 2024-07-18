class Solution {
    public int mySqrt(int x) {

        //corner cases ==> 0 and 1 will always have 0 and 1 as sqrt respectively
        if(x==0||x==1){
            return x;
        }

        //smallest possible sqrt
        long start = 1;
        //reducing the search space because it will always lie before x/2
        long end = x/2;
        //store the possible ans (best candidate to the nearest int)
        long ans = 0;


        //simple bs
        while(start<=end){
            long mid = start + (end-start)/2;

            //sqrt
            long sqrt = mid*mid;


            if(sqrt == x){
                return (int)mid;
            }
            else if(sqrt < x){
                start = mid +1;

                //ans updates to nearest int available and still searches while the cond is true
                ans = mid;
            }
            else{
                end = mid-1;
            }
        }
        //returns the final ans
        return (int)ans;
    }
}