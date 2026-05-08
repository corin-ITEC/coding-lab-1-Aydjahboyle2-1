package week_1;

import static input.InputUtils.doubleInput;

/**
 *
 * A parcel delivery company charges different rates based on weight.
 *
 */

public class Question_5_Parcel_Delivery {
    
    // Maximum weight allowed for shipping
    public static double MAX_WEIGHT = 30;
    
    public static void main(String[] args) {
        
        // Ask user for parcel weight
        double weight = doubleInput("Enter weight of parcel");
        
        // Check if parcel can be shipped
        boolean canShip = canShip(weight);
        
        // If valid, calculate and display price
        if (canShip) {
            double price = calculatePrice(weight);
            System.out.printf("It will cost %.2f to send your %.2f pound parcel.", price, weight);
        } 
        // If invalid, show error message
        else {
            System.out.printf("A parcel that weighs %.2f pounds can't be shipped.", weight);
        }
    }
    
    
    public static boolean canShip(double weight) {

        // If weight is less than or equal to 0 → cannot ship
        if (weight <= 0) {
            return false;
        }

        // If weight is greater than max allowed → cannot ship
        if (weight > MAX_WEIGHT) {
            return false;
        }

        // Otherwise → valid weight
        return true;
    }
    
    
    public static double calculatePrice(double weight) {

        // Price for parcels up to 10 pounds
        if (weight <= 10) {
            return weight * 2.15;
        } 
        // Price for parcels up to 20 pounds
        else if (weight <= 20) {
            return weight * 1.55;
        } 
        // Price for parcels up to 30 pounds
        else if (weight <= 30) {
            return weight * 1.15;
        } 
        // If weight somehow invalid, return 0
        else {
            return 0;
        }

    }
    
}
