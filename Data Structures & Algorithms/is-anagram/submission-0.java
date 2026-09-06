class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(sMap.containsKey(c)){
                int count = sMap.get(c);
                count++;
                sMap.put(c, count);
            } else {
                sMap.put(c, 1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(tMap.containsKey(c)){
                int count = tMap.get(c);
                count++;
                tMap.put(c, count);
            } else {
                tMap.put(c,1);
            }
        }
        if(sMap.equals(tMap)){
            return true;
        }
        return false;
    }
}
