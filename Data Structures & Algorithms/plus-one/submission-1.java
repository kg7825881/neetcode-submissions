class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int right = n - 1;
        for(int i = n-1; i>=0; i--){
            if(digits[i] < 9 && i <= n-1){
                digits[i] = digits[i]+1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int new_digit[] = new int[n+1];
        for(int i=n-1; i>=0; i--){
            new_digit[i+1] = digits[i];
        }
        new_digit[0] = 1;

        return new_digit;
    }
}
