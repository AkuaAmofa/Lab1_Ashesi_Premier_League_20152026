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
        System.out.println("\n Player Details ");
        System.out.println("Player Name" + playerName);
        System.out.println("Age " + playerAge);
        System.out.println("Height " + playerHeight + "m");
        System.out.println("Weight " + playerWeight + "lbs");
        System.out.println("Jersey Number" + jerseyNumber);

        // Task 2
        final double Pound = 0.45359237;
        final int meter = 100;

        double weightInKg = playerWeight * Pound;
        double heightInCm = playerHeight * meter;

        System.out.println("\n Converted Values");
        System.out.println("Player Name" + playerName);
        System.out.println("Age" + playerAge);
        System.out.println("Height in centimeters " + (int)heightInCm + "cm");
        System.out.println("Weight in kilograms" + weightInKg + "kg");
        System.out.println("Jersey Number " + jerseyNumber);

        //Task 3
        System.out.println("Current Age:" + playerAge);
        playerAge++; 
        System.out.println("Next Season Age:" + playerAge);
        playerAge--;
        System.out.println("Jersey Number after Penalty:" + playerAge);

        //Task 4
        boolean isEligible = (playerAge >= 18 && playerAge <= 35 && weightInKg <90);

        if (isEligible) {
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
        if (playerAge < 18 || weightInKg >= 90) {
            System.out.println("Player has a problem (either too young ot too heavy)");
        } else {
            System.out.println("No problem");
        }

        if(!isEligible) {
            System.out.println("Not Eligible");
        }else {
            System.out.println("Eligible");
        }

        //Task 5 
        if (playerAge < 20) {
            System.out.println("Rising Star");
        } else if (playerAge <= 30) {
            System.out.println("Prime Player");
        } else {
            System.out.println("Veteran");
        }

        // Task 6
        String position = "";
        switch (jerseyNumber) {
            case 1:
                position = "Goalkeeper";
                break;
            case 2: case 5:
                position = "Defender";
                break;
            case 6: case 8: 
                position = "Midfielder";
                break;
            case 7: case 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            default:
                position = "Player position not known";
                break;
        }

        //Task 7a
        switch (jerseyNumber) { 
            case 2: 
            System.out.println("Defender"); 
            case 6: 
            System.out.println("Midfielder"); 
            case 7: System.out.println("Winger"); 
            default: System.out.println("Player position not known"); }


     //Task 7b
     System.out.println("\n--- Task 7B: Grouped Cases ---");

        switch (jerseyNumber) { 
            case 2: case 5: 
            System.out.println("Defender"); 
            case 6: case 8: 
            System.out.println("Midfielder"); 
            case 7: case 11: 
            System.out.println("Winger"); 
            case 9: 
            System.out.println("Striker"); 
            case 10: System.out.println("Playmaker"); 
            default: System.out.println("Player position not known"); }

            //Task 8
            String category; 
            if (playerAge < 20) { 
                category = "Rising Star"; 
            } else if (playerAge<= 30) { 
                category = "Prime Player"; 
            } else { category = "Veteran"; 
        }
        
        if (category.equals("Prime Player")) 
        { if (weightInKg< 80) 
            { System.out.println("Starting Lineup"); 
        } else { 
            System.out.println("Bench"); 
        } } else {
            System.out.println("Bench"); }

        //Task 9
        String decision = isEligible ? "Play" : "Rest"; 
        System.out.println(decision);

        //Task 10
        System.out.println("\n--- Task 10: PLAYER REPORT ---");
        System.out.println("Player: " + playerName); 
        System.out.println("Age: " + playerAge + " (" + category + ")"); 
        System.out.println("Height: " + (int)heightInCm + " cm"); 
        System.out.println("Weight: " + weightInKg+ " kg"); 
        System.out.println("Jersey: " + jerseyNumber); 
        System.out.println("Position: " + position); 
        System.out.println("Attacker jersey: " + (jerseyNumber == 7 || jerseyNumber == 9 || jerseyNumber == 10 || jerseyNumber == 11 ? "Yes" : "No")); 
        System.out.println("Eligibility: " + (isEligible ? "Eligible" : "Not Eligible")); 
        System.out.println("Lineup Decision: " + (category.equals("Prime Player") && weightInKg < 80 ? "Starting Lineup" : "Bench")); 
        System.out.println("Final Decision: " + decision);


        input.close(); // Close at the very end
    }
}