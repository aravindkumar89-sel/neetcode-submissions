class Solution {
    public boolean isPalindrome(String s) {
        char a[] = s.toCharArray();
        StringBuilder left = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (String.valueOf(a[i]).matches("[a-zA-Z0-9]")) {
                left.append(a[i]);
            }
        }

        StringBuilder right = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            if (String.valueOf(a[i]).matches("[a-zA-Z0-9]")) {
                right.append(a[i]);
            }
        }

        return left.toString().equalsIgnoreCase(right.toString());
    }
}
