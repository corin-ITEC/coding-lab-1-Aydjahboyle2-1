package week_1;

import static input.InputUtils.*;


public class Question_6_Windows_10_Install {

    public static void main(String[] args) {

        // Ask user for current operating system
        String currentOS = stringInput("What is your current operating system?");

        // Ask for processor speed in GHz
        double processorSpeed = doubleInput("What is your current processor speed, in GHz?");

        // Ask for RAM in GB
        double ram = doubleInput("How much RAM do you have, in GB?");

        // Call method to check if requirements are met
        boolean canUpgradeToWindows10 = checkWindows10SystemRequirements(currentOS, processorSpeed, ram);

        // Print result based on true/false
        if (canUpgradeToWindows10) {
            System.out.println("You can upgrade to Windows 10");
        } else {
            System.out.println("Sorry, you can't upgrade to Windows 10");
        }

    }

    public static boolean checkWindows10SystemRequirements(String currentOS, double processorSpeed, double ram) {

        // Check ALL requirements at once:
        // OS must be "Windows 7" OR "Windows 8"
        // AND processor must be at least 1 GHz
        // AND RAM must be at least 2 GB
        if ((currentOS.equals("Windows 7") || currentOS.equals("Windows 8")) 
                && processorSpeed >= 1 
                && ram >= 2) {

            return true; // meets all requirements

        } else {

            return false; // does not meet requirements

        }

    }
    
}
