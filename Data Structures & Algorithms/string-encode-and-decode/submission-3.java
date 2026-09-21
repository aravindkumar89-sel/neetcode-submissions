class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.isEmpty())
            return "";
            
        for (String str : strs) {
            sb.append(str.length() == 0 ? "len0----" : str + "----");
        }
        return Base64.getEncoder().encodeToString(sb.toString().getBytes());
    }

    public List<String> decode(String str) {
        if (str.isEmpty())
            return new ArrayList<String>();

        String decodeStr = new String(Base64.getDecoder().decode(str));

        String[] strArray = decodeStr.split("----");
        List<String> returnList = new ArrayList<String>();
        for (int i = 0; i < strArray.length; i++) {
            String str1 = strArray[i];
            if (str1.length() == 4 && str1.equals("len0")) {
                returnList.add("");
            } else {
                returnList.add(str1);
            }
        }

        return returnList;
    }
}
