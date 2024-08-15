class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(count.containsKey(nums[i])){
                count.put(nums[i], count.get(nums[i])+1);
            }else{
                count.put(nums[i], 1);
            }
            
        }
        for(int i = 0; i<n; i++){
            if(count.get(nums[i]) > n/3){
                    if(result.contains(nums[i])) continue;
                else{
                    result.add(nums[i]);
                }
            }
        }
        return result;
    }
}
