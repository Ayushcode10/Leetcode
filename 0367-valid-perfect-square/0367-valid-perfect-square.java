class Solution {
    public boolean isPerfectSquare(int n) {

        ///corner case -> 0 and 1 are always perfect squares
        if(n <= 1){
            return true;
        }

        //start from 1
        long start =1;
        //go to the last element which is the input value
        long end = n;

        //simple binary search 
        while(start<=end){
            long mid = start + (end - start)/2;

            // the perfect squareroot of a number will lie in the ascending natural no.s array if exists since it will always be smaller than n
            // and mid will be the perfect squareroot
            long square = mid*mid;
            if(square == n){
                //mid is the perfect square
                return true;
            }
            //search in the higher than the mid part of the array
            else if (square < n){
                start = mid +1;
            }
            //search in the lower than the mid part of the array
            else{
                end = mid -1;
            }
        }
        //no valid sqrt
        return false;
    }
}