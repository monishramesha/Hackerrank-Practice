class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s1;
        s1 = new Stack<>();
        Map<Integer, Integer> m = new HashMap<>();
        for(int v : nums2){
            while(!s1.isEmpty() && s1.peek() < v){
                m.put(s1.pop(),v);
            }
            s1.push(v);
        }
        int n = nums1.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = m.getOrDefault(nums1[i], -1);
        }
        return ans;
    }    
}
