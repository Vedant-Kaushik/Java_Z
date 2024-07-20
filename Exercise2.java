import java.util.Scanner;
import java.util.Random;

class GTN {
    public int GuessTheNumber() {
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
    //    System.out.println("Random Number (for debugging): " + randomNum);
        return randomNum;
    }

    public int takeUserInput() {
        Scanner f = new Scanner(System.in);
        System.out.print("Enter your Guess = ");
        int guess = f.nextInt();
        return guess;
    }

    public void guessinggame(int randomNum) {
        int chance = 10;
        while (chance > 0) {
            int guess = takeUserInput();
            if (randomNum == guess) {
                System.out.println("7 Crore");
                System.out.println("It took you " + (10 - chance + 1) + " chances");
                return;
            } else if (randomNum > guess) {
                System.out.println("Increase your number");chance -= 1;
                System.out.println(chance+" chances left");

            } else if (randomNum < guess) {
                System.out.println("Decrease your number");chance -= 1;
                System.out.println(chance+" chances left");

            }


        }
        System.out.println("OOPS 🫠 iykyk");
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        GTN game1 = new GTN();
        int randomNum = game1.GuessTheNumber();
        game1.guessinggame(randomNum);
    }
}