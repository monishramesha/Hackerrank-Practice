class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        System.arraycopy(nums1, 0, merged, 0, m);
        System.arraycopy(nums2, 0, merged, m, n);
        Arrays.sort(merged);
        int len = merged.length;
        double median = 0;
        if(len % 2 == 0){
            median = (merged[len/2] + merged[(len/2) - 1]) / 2.0;
        }else{
            median = merged[len/2];
        }
        return median;
    }
}
