class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> s1;
        s1 = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for(int i=0; i< (n << 1); i++){
            while(!s1.isEmpty() && nums[s1.peek()] < nums[i%n]){
                ans[s1.pop()] = nums[i%n];
            }
            s1.push(i%n);
        }
        return ans;
    }
}
