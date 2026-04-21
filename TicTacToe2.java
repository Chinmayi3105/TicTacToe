import java.util.Random;
import java.util.Scanner;

public class TicTacToe2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char player1Symbol, player2Symbol;
        int toss = random.nextInt(2); // 0 or 1

        System.out.println("Welcome to Tic Tac Toe");

        if (toss == 0) {
            System.out.println("Player 1 won the toss and starts first.");
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            System.out.println("Player 2 won the toss and starts first.");
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);

        sc.close();
    }
}