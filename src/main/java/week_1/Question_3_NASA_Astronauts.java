package week_1;

import static input.InputUtils.doubleInput;

public class Question_3_NASA_Astronauts {

    public static void main(String[] args) {

        // Get the user's height in inches
        double height = doubleInput("How tall are you, in inches?");

        // Get how far the user can swim in yards
        double swimDistance = doubleInput("How far can you swim, in yards?");

        // Call the method to check if the user qualifies
        boolean astronautPotential = checkAstronautQualifications(height, swimDistance);

        // If they qualify, print this message
        if (astronautPotential) {
            System.out.println("You have astronaut potential!");
        } 
        // Otherwise, print this message
        else {
            System.out.println("Sorry, you don't meet NASA's requirements.");
        }

    }

    public static boolean checkAstronautQualifications(double height, double swimDistance) {

        // Check if height is between 58 and 76 AND swim distance is at least 75
        if (height >= 58 && height <= 76 && swimDistance >= 75) {
            return true;  // meets all requirements
        } else {
            return false; // does not meet requirements
        }

    }

}
