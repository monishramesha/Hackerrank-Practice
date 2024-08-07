class Solution {
    public int searchInsert(int[] arr, int target) {
        int l = arr.length;
        for(int i=0; i<l; i++){
            if(arr[i] == target) return i;
            else if(arr[i] > target) return i;
        }
        return l;
    }
}
