class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> dataMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            Integer complement = target - nums[i];
            
            if (dataMap.containsKey(complement) && dataMap.get(complement) != i) {
                return new int[] {dataMap.get(complement), i};
            }
            
            dataMap.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");    
    }
}
