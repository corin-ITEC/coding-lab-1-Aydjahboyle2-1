package week_1;

import static input.InputUtils.yesNoInput;

public class Question_4_Mail_Prices {

    // Base price for a normal (machinable) letter
    public static int MACHINABLE_LETTER_PRICE = 49;

    // Extra cost if the letter is not machinable
    public static int NON_MACHINABLE_SURCHARGE = 21;

    public static void main(String[] args) {

        // Ask user if the letter is rectangular (true = yes, false = no)
        boolean isRectangular = yesNoInput("Is the letter rectangular?");

        // Ask user if the letter is flat (true = yes, false = no)
        boolean isFlat = yesNoInput("Is the letter flat?");

        // Call method to calculate the mailing price
        int price = calculateStampPrice(isRectangular, isFlat);

        // Display the final price in cents
        System.out.println("Your letter will cost " + price + " cents to mail.");

    }

    public static int calculateStampPrice(boolean isRectangle, boolean isFlat) {

        // Check if the letter is BOTH rectangular AND flat
        // If yes → it can be processed by machine → base price only
        if (isRectangle && isFlat) {
            return MACHINABLE_LETTER_PRICE;
        } 
        // If NOT → it is non-machinable → add extra surcharge
        else {
            return MACHINABLE_LETTER_PRICE + NON_MACHINABLE_SURCHARGE;
        }

    }

}
