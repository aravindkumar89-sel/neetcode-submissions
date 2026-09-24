class Solution {
    public boolean isPalindrome(String s) {
        char a[] = s.toCharArray();
        StringBuilder left = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (String.valueOf(a[i]).matches("[a-zA-Z0-9]")) {
                left.append(a[i]);
            }
        }

        return left.toString().equalsIgnoreCase(left.reverse().toString());
    }
}
