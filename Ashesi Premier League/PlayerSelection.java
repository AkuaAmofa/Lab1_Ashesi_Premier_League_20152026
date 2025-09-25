import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Task 1: Collect details
        System.out.print("Enter Player Name: ");
        String playerName = input.nextLine();

        System.out.print("Enter Player Age: ");
        int playerAge = input.nextInt();

        System.out.print("Enter Height in meters: ");
        double playerHeight = input.nextDouble();

        System.out.print("Enter Weight in pounds: ");
        double playerWeight = input.nextDouble();

        System.out.print("Enter Jersey Number: ");
        int jerseyNumber = input.nextInt();

        // Display details (Sample Output)
        System.out.println("\n--- Player Details ---");
        System.out.println("Player Name – " + playerName);
        System.out.println("Age – " + playerAge);
        System.out.println("Height – " + playerHeight + "m");
        System.out.println("Weight – " + playerWeight + "lbs");
        System.out.println("Jersey Number – " + jerseyNumber);

        input.close(); // Close at the very end
    }
}
