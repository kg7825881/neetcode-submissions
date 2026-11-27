class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<=nums.length; i++){
            if(i <= nums.length-1 && nums[i] != i){
                return i;
            }

            if(i == nums.length){
                return i;
            }
        }

        return -1;
    }
}
