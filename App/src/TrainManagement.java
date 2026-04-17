import java.util.ArrayList;
import java.util.List;

public class TrainManagement {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        // Add passenger bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display bogies after insertion
        System.out.println("Bogies after addition: " + trainConsist);

        // Remove a bogie (AC Chair)
        trainConsist.remove("AC Chair");
        System.out.println("After removing AC Chair: " + trainConsist);

        // Check existence of Sleeper bogie
        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Final state of train consist
        System.out.println("Final train consist: " + trainConsist);

        // Program continues...
    }
}