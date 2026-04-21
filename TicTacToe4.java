import java.util.Scanner;

public class TicTacToe4 {

    public static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a slot number (1-9): ");
        return sc.nextInt();
    }

    public static void convertToRowCol(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Row Index: " + row);
        System.out.println("Column Index: " + col);
    }

    public static void main(String[] args) {
        int slot = getUserSlot();
        convertToRowCol(slot);
    }
}