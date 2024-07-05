class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            if(map.get(key) > nums.length/3){
                ls.add(key);
            }
        }
        return ls;
    }
}
