class Solution {
    public int findKthPositive(int[] arr, int k) {

        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;

            //no. of missing elemnts in the given array
            int missing = arr[mid] - (mid+1);

            if(missing<k){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return start +k;
    }
    //1       2 3   4 5
    //1,2,3,4,5,6,7,8,9,10,11
    //2,3,4,7,11
}