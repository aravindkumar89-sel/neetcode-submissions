class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resMap = new HashMap<String, List<String>>();
        for (String inp : Arrays.asList(strs)) {
            String sortedKey = getSortedKey(inp);
            resMap.computeIfAbsent(sortedKey, k -> new ArrayList<String>()).add(inp);
        }

        return new ArrayList<>(resMap.values());
    }

    private String getSortedKey(String inp) {
        char[] c = inp.toCharArray();
        Arrays.sort(c);

        return new String(c);
    }
}
