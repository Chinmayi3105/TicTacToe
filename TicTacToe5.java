public class TicTacToe5 {

    // 3x3 board initialized with empty spaces
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidMove(1, 1)); // true
        board[1][1] = 'X';
        System.out.println(isValidMove(1, 1)); // false (already occupied)
        System.out.println(isValidMove(3, 0)); // false (out of bounds)
    }

    /**
     * Checks if the given move is valid:
     * - Within bounds (0–2)
     * - Cell is empty
     */
    static boolean isValidMove(int row, int col) {

        // Boundary check
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {
            return false;
        }

        return true;
    }
}