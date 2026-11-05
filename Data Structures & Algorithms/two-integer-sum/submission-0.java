class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            for(int j=n-1; j>=0; j--){
                if(nums[i]+nums[j] == target && i != j){
                    result[0] = j;
                    result[1] = i;
                    break;
                }
            }
        }

        return result;
    }
}
