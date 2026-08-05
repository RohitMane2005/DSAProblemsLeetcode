class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String str : strs){
           int[] freq = new int[26];
           for(char ch : str.toCharArray()){
            freq[ch-'a']++;
           }

           char[] keyChar = new char[26];
          for (int i = 0; i < 26; i++) {
                keyChar[i] = (char) ('a' + freq[i]); 
            }

            String key = new String(keyChar);
           map.computeIfAbsent(key,k -> new ArrayList<>()).add(str);

        }
        return new ArrayList<>(map.values());
    }
}