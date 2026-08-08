class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for (int i = 0; i < strs.length; i++) {

            int[] charArr = new int[26];

            for (int j = 0; j < strs[i].length(); j++) {
                int index = strs[i].charAt(j) - 'a';
                charArr[index]++;
                
            }


            map.putIfAbsent(Arrays.toString(charArr), new ArrayList<String>());
            map.get(Arrays.toString(charArr)).add(strs[i]);
            
        }

        return new ArrayList<>(map.values());
    }
}
