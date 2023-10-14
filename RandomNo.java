import java.util.*;

public class RandomNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("Guess the number and have fun");
        System.out.println("Choose the number between 1 to 25");
        System.out.println("You are having 2 rounds");
        
        for (int round = 1; round <= 2; round++) {
            int s;
            int chances;
            
            if (round == 1) {
                s = r.nextInt(25) + 1; 
                chances = 5; 
            } else {
                s = r.nextInt(10) + 1; 
                chances = 3; 
            }
            int remainingchances = chances;
            
            System.out.println("In Round " + round + " you are having " + chances + " chances to guess the game");
            
            while (remainingchances > 0) {
                System.out.println("Enter the number you want to choose (1-25):");
                int n = sc.nextInt();
                
                if (n == s) {
                    System.out.println("You Guessed right!");
                    break; 
                } else if (n < s) {
                    System.out.println("Try Again! Your guess is too low.");
                } else {
                    System.out.println("Try Again! Your guess is too high.");
                }
                
                remainingchances--;
                System.out.println("Chances left: " + chances);
            }
            
            if (remainingchances == 0) {
                System.out.println("No chances left. The correct number was: " + s);
            }
            
            if (round < 2) {
                System.out.println("Round " + (round + 1) + " will begin shortly.");
            } else {
                System.out.println("Game Over!");
            }
        }
        
        sc.close();
    }
}
