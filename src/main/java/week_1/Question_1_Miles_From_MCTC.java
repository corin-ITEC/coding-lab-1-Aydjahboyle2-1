package week_1;

import static input.InputUtils.*;


public class Question_1_Miles_From_MCTC {

    public static void main(String[] args) {

        // Ask the user for how many miles they live from MCTC
        double miles = doubleInput("How many miles do you live from MCTC? ");

        // Call the method to get the correct message
        String response = milesFromMCTC(miles);

        // Print the result
        System.out.println(response);

    }

    public static String milesFromMCTC(double miles){

        // If the distance is greater than 10 miles
        if (miles > 10) {
            return "You live more than 10 miles from MCTC";
        } 
        // If the distance is exactly 10 miles
        else if (miles == 10) {
            return "You live exactly 10 miles from MCTC";
        } 
        // If the distance is less than 10 miles
        else {
            return "You live less than 10 miles from MCTC";
        }

    }

}

