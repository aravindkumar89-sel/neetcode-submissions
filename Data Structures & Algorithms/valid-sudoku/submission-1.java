class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet> rowMap = new HashMap<Integer, HashSet>();
        Map<Integer, HashSet> colMap = new HashMap<Integer, HashSet>();
        Map<Integer, HashSet> boxMap = new HashMap<Integer, HashSet>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char num = board[r][c];
                //System.out.println("Num :" + num);
                if (num == '.') {
                    continue;
                }
                HashSet rowSet = rowMap.computeIfAbsent(r, k -> new HashSet<String>());
                //System.out.println("RowSet :" + rowSet);
                if (!rowSet.contains(num)) {
                    rowSet.add(num);
                } else {
                    return false;
                }

                HashSet colSet = colMap.computeIfAbsent(c, k -> new HashSet<String>());
                //System.out.println("ColSet :" + colSet);
                if (!colSet.contains(num)) {
                    colSet.add(num);
                } else {
                    return false;
                }

                HashSet boxSet =
                    boxMap.computeIfAbsent((r / 3) * 3 + (c / 3), k -> new HashSet<String>());
                //System.out.println("BoxSet :" + boxSet);
                if (!boxSet.contains(num)) {
                    boxSet.add(num);
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
