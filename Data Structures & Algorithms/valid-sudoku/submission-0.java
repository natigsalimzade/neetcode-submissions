class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    for (int k = j + 1; k < board[i].length; k++) {
                        if (board[i][j] == board[i][k]) {
                            return false;
                        }
                    }

                    for (int k = i + 1; k < board.length; k++) {
                        if (board[i][j] == board[k][j]) {
                            return false;
                        }
                    }

                    for (int m = i - i % 3; m < i + 3 - i % 3; m++) {
                        for (int n = j - j % 3; n < j + 3 - j % 3; n++) {

                            if(m == i && n ==j){
                                continue;
                            }

                            if (board[i][j] == board[m][n]) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
