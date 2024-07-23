import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Array of choices
        String[] choices = {"Rock", "Paper", "Scissors"};

        while (true) {
            // Get user's choice
            System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
            String userChoice = scanner.next();

            // Validate user input
            if (!userChoice.equals("Rock") && !userChoice.equals("Paper") && !userChoice.equals("Scissors")) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                continue;
            }

            // Generate random computer choice
            int randomIndex = random.nextInt(3); // Generates 0, 1, or 2
            String computerChoice = choices[randomIndex];

            // Display choices
            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + computerChoice);

            // Determine and display result
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            // Ask user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    // Function to determine the winner
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if (userChoice.equals("Rock")) {
            return computerChoice.equals("Scissors") ? "You win!" : "Computer wins!";
        } else if (userChoice.equals("Paper")) {
            return computerChoice.equals("Rock") ? "You win!" : "Computer wins!";
        } else { // userChoice.equals("Scissors")
            return computerChoice.equals("Paper") ? "You win!" : "Computer wins!";
        }
    }
}
