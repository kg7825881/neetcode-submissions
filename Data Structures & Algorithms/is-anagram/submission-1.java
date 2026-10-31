class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> dict1 = new HashMap<>();
        Map<Character, Integer> dict2 = new HashMap<>();

        for(char ch1 : s.toCharArray()){
            dict1.put(ch1, dict1.getOrDefault(ch1, 0) + 1);
        }

        for(char ch2 : t.toCharArray()){
            dict2.put(ch2, dict2.getOrDefault(ch2, 0) + 1);
        }

        return dict1.equals(dict2);
    }
}
