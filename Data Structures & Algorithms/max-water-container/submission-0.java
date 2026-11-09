class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0, right = n - 1;
        int maxarea = 0;
        
        while(left < right){
            int width = right - left;
            int ht = Math.min(heights[left], heights[right]);

            int area = width * ht;
            if(area > maxarea){
                maxarea = area;
            }

            if(heights[left] > heights[right]){
                right--;
            } else {
                left++;
            }
        }
        return maxarea;
    }
}
