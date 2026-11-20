class Solution {
    public int freq(int n){
        int c=0; 
        for(int i=0; i<32; i++){
            int mask = 1<<i;
            if((mask & n) != 0){
                ++c;
            }
        }
        return c;
    }
    public int[] countBits(int n) {
        int[] res = new int[n+1];

        for(int i=0; i<=n; i++){
            res[i] = freq(i);
        }

        return res;
    }
}
