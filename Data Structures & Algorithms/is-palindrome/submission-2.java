class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        if(len <= 1){
            return true;
        }

        s = s.trim().toLowerCase();
        String st="";

        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch != ' ' && Character.isLetterOrDigit(ch)){
                st = st+ch;
            } else {
                continue;
            }
        }

        int l = st.length();
        int left = 0, right = l-1 ;
        while(left<right){
            char lch = st.charAt(left);
            char rch = st.charAt(right);
            if(lch == rch){
                ++left;
                --right;
            } else {
                return false;
            }
        }

        return true;
    }
}
