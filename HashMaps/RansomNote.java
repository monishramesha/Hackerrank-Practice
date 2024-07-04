import java.util.HashMap;

class Solution {
    public HashMap mapping(String magazine){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0; i<magazine.length();i++){
            char ch = magazine.charAt(i);
            if(hashMap.containsKey(ch)){
                int currentValue = hashMap.get(ch);
                hashMap.put(ch, currentValue+1);
            }else{
                hashMap.put(ch, 1);
            }
        }
        return hashMap;
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        map = mapping(magazine);
        for(int i=0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(map.containsKey(ch) == false || map.get(ch) == 0){
                return false;
            }else{
                int currVal = map.get(ch);
                map.put(ch, currVal-1);
            }
        }
        return true;
    }
}
