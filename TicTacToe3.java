import java.util.Scanner;

public class TicTacToe3 {

    public static int getUserSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        int userChoice = getUserSlot();

        System.out.println("You selected slot: " + userChoice);
    }
}