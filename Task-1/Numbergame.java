import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int Score = 0;
        String PlayAgain;
        System.out.println("\n ======= NUMBER GUESSING GAME =======");

        do {
            int num = random.nextInt(100) + 1;
            int maxAttempts = 7;
            int attempts = 0;
            boolean gussedCorrect = false;
            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");
            while (attempts < maxAttempts) {
                System.out.println("Enter Your Guess: ");
                int guess = sc.nextInt();
                attempts++;
                if (guess == num) {
                    System.out.println("\nCongratulations !! You guessed the correct number.");
                    System.out.println("\nYou Guessed it in " + attempts + " attempts.");
                    Score += maxAttempts - attempts + 1;
                    gussedCorrect = true;
                    break;
                } else if (guess < num) {
                    System.out.println("Too Low! Try again....");
                } else {
                    System.out.println("Too High!! Try again....");
                }
                System.out.println("\nAttempts Remaining : " + (maxAttempts - attempts));
            }

            if (!gussedCorrect) {
                System.out.println("\nYou have used all your attempts..");
                System.out.println("The correct number was : " + num);
            }
            System.out.println("Your Currect Score : " + Score);

            System.out.println("\nDo you want to play another round ? (y/n) : ");
            PlayAgain = sc.next();
        } while (PlayAgain.equals("y") || PlayAgain.equals("Y"));

        System.out.println("\n====== Game Over ======");
        System.out.println("Your Final Score : " + Score);
        System.out.println("Thank You!! for playing...\n");

        sc.close();
    }
}
