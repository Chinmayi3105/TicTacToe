public class TicTacToe6 {

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("--+---+--");
            }
        }
    }

    public static void main(String[] args) {

        placeMove(1, 1, 'X'); // Example move

        printBoard();
    }
}