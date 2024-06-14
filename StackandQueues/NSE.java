public class Solution {
    public int[] prevSmaller(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> s1;
        s1 = new Stack<>();
        for(int i=0; i<n; i++){
            while(!s1.isEmpty() && s1.peek() >= A[i]){
                s1.pop();
            }if(!s1.isEmpty() && s1.peek() < A[i]){
                ans[i] = s1.peek();
            }
            s1.push(A[i]);
        }
        return ans;
    }
}
