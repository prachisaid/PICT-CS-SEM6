public class NQueens {
    public static int cnt = 1;
    public static void main(String[] args) {
        System.out.println("Backtracking");
        backtracking();
        System.out.println("Branch And Bound");
        branchAndBound();
    }

    public static void backtracking() {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queensB(board, 0));
    }

    public static void branchAndBound() {
        int n = 4;
        boolean[][] board = new boolean[n][n];

        boolean[] colCheck = new boolean[n];
        boolean[] rightDiagonal = new boolean[2 * n - 1];
        boolean[] leftDiagonal = new boolean[2 * n - 1];

        queensBNB(board, 0, colCheck, leftDiagonal, rightDiagonal);
    }

    private static int queensB(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe

            if(isSafe(board, row, col)){
                board[row][col] = true;
//                display(board);
                count = count + queensB(board, row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        //Left Diagonal
        int shiftLeft = Math.min(row, col);

        for (int i = 1; i <= shiftLeft; i++){
            if(board[row-i][col-i] == true){
                return false;
            }
        }

        // Right Diagonal
        int shiftRight = Math.min(row,board.length-col-1);
        for (int i = 1; i <= shiftRight; i++){
            if(board[row-i][col+i] == true){
                return false;
            }
        }

        return true;
    }

    private static void queensBNB(boolean[][] board, int row, boolean[] colCheck, boolean[] leftDiagonal, boolean[] rightDiagonal) {
        if(row == board.length) {
            System.out.println("FINAL Arrangement " + cnt);
            cnt += 1;
            display(board);
            return;
        }

        for(int col = 0; col < board[row].length; col++) {
            if(!colCheck[col] && !leftDiagonal[row + col] && !rightDiagonal[row - col + board.length - 1]) {
                board[row][col] = true;
                colCheck[col] = true;
                leftDiagonal[row + col] = true;
                rightDiagonal[row - col + board.length - 1] = true;

                queensBNB(board, row + 1, colCheck, leftDiagonal, rightDiagonal);

                board[row][col] = false;
                leftDiagonal[row + col] = false;
                colCheck[col] = false;
                rightDiagonal[row - col + board.length - 1] = false;
            }
        }
    }

    private static void display(boolean[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j]) {
                    System.out.print("Q ");
                }
                else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}