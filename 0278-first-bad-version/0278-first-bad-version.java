/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        
        //last version will always be bad 
        int result = n;

        while(start<result){
            int mid = start + (result-start)/2;

            //bad will tell if the version selected is good or bad(T or F)
            boolean bad = isBadVersion(mid);

            //if selected version is bad 
            //the result's value from the last element will get updated to the mid element
            //then it will check for the first bad element lower than the mid
            if(bad){
                result = mid;
            }

            /*if selected element is good therefore the search space will be 
            reduced to [(start = mid+1) to (end element)]
            -> and then it'll search again for the least bad version!
            */
            else{
                start = mid +1;
            }
        }

        // if there is no bad version therefore the first element will be the bad version
        return start;  
    }
}