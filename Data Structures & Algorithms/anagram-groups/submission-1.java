class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> map = new HashMap();

        for(String s: strs){
            int count[]=new int[26];

            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            StringBuffer sb = new StringBuffer();
            for(int i:count){
                sb.append("#");
                sb.append(i);
            }

            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}
