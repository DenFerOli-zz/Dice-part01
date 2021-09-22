import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanf = new Scanner(System.in);
        Random diceRandom = new Random();

        int player1, cpu, dice;

        System.out.println("-------DICE------\n");
        cpu = diceRandom.nextInt(6) + 1;
        System.out.println("CPU Choose: " + cpu);
        System.out.print("Choose a number of 1 to 6: ");
        player1 = scanf.nextInt();

        System.out.println("--------------------------");
        dice = diceRandom.nextInt(6) + 1;

        System.out.println("Dice: " + dice);

        if (player1 == dice) {
            System.out.println("You win");
        } else if (cpu == dice) {
            System.out.println("CPU win");
        } else {
            System.out.println("DRAW");
        }

        scanf.close();
    }
}
