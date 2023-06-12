import java.util.Scanner;

public class JumpingGame {
    /**
     * This function builds a jumping game.
     * 
     * @param args (String[]): Command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get the number of jumps
            System.out.print("Enter the number of jumps: ");
            int numJumps = scanner.nextInt();
            
            // Initialize the game
            int position = 0;
            int jumpDistance = 0;
            
            // Play the game
            for (int i = 1; i <= numJumps; i++) {
                System.out.println("Jump #" + i);
                
                // Get the jump distance
                System.out.print("Enter the jump distance: ");
                jumpDistance = scanner.nextInt();
                
                // Update the position
                position += jumpDistance;
                
                // Print the current position
                System.out.println("Current position: " + position);
            }
        } catch (Exception e) {
            // Log the error
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}