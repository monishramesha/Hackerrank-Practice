class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int g_len = g.length;
        int s_len = s.length;
        for(int i=0, j=0; i<g_len; i++){
            while(j<s_len && s[j] < g[i]){
                j++;
            }
            if(j++ >= s_len){
                return i;
            }
        }
        return g_len;
    }
}
