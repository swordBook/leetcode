class Solution {
    public int maxSubArray(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        int max = Integer.MIN_VALUE;

        int low = 0;

        int sum = 0;

        while(low < nums.length){

            sum += nums[low];

            max = Math.max(sum, max);

            if(sum < 0){
                sum = 0;
            }

            low++;
        }

        return max;
    }
}
