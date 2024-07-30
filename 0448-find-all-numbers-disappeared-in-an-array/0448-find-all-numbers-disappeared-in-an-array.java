class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i< arr.length){

            int correctIndex = arr[i] -1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }

        }
        //search
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1 ){
               ans.add(index+1);
            }

        }
        return ans;
    }
    public void swap(int[] arr,int f, int s){
        int temp = arr[f];
        arr[f]= arr[s];
        arr[s] = temp;
    }
    }