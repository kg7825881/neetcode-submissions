class Solution {
    public int freqNums(int[] arr, int num){
        int c = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                ++c;
            }
        }

        return c;
    }
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        int[] freq = new int[len];

        for(int i=0; i<len; i++){
            freq[i] = freqNums(nums, nums[i]);
        }

        for(int x : freq){
            if(x>1){
                return true;
            }
        }

        return false;
    }
}