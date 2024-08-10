class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        StringBuilder result = new StringBuilder();
        for(int i = words.length - 1; i>=0; i--){
            if(words[i] == " " && words[i-1] == " "){
                continue;
            }else{
                result.append(words[i]).append(" ");
            }
        }
        String res = result.toString().trim();
        return res;
    }
}
