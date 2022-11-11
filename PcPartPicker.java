// Import packages
import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;
//Declare class
public class PcPartPicker{

  static void recordNamePrice(String name, double price, ArrayList<String> partsList, ArrayList<Double> priceList) {
        Scanner input = new Scanner(System.in);
        //Captures user input for name
        name = input.nextLine();
        //Stores input in the "name" array list
        partsList.add(name);
        //Immediately call next method to capture price input
        recordPrice(price, priceList);
        input.close();
    }
    static void recordPrice(double price, ArrayList<Double> priceList) {
        Scanner input = new Scanner(System.in);
        boolean repeat=true;
        while(repeat)
        {
            try {
                System.out.print("|  $ ");
                //Captures user input for price
                price = input.nextDouble();
                //Stores input in the "name" array list
                priceList.add(price);
                System.out.println("|");
                //Exit while loop if no errors occur
                break;
            } catch (Exception e) {
                //If error occurs, allow user to re-enter in price felid
                System.out.println("Invalid input please input a number");
                input.next();
            }
            input.close();
       }
    }
    static void calculateTotals(double totalCost, int discountPercent) {
        //Calculations
        final double tax = 1.13;
        final double preBuilt = 1099.59;
        double discount = (double) discountPercent / 100;
        double totalWithDiscount = totalCost - (totalCost * discount);
        double totalWithTax = totalWithDiscount * tax;
        //Identifies format for english, Canadian currency format
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        //Print final calculations, apply currency format
        System.out.println(" ");
        System.out.println("Total: " + currencyFormatter.format(totalCost));
        System.out.println("Total With Discount Applied: " +  currencyFormatter.format(totalWithDiscount));
        System.out.println("Total With Tax: " +  currencyFormatter.format(totalWithTax));
        System.out.println("");
        if (totalWithTax > preBuilt) {
            System.out.println("This build is more expensive than a pre built with similar specs.");
        }else {
            System.out.println("This build is a better deal than the pre built with similar specs.");
        }
        
    }
    public static void main (String[] args) {
        // Declare variables
        String name = "";
        double price = 0.0;
        //Create Arrays
        ArrayList<String> partsList = new ArrayList<String>();
        ArrayList<Double> priceList = new ArrayList<Double>();
        String[] items = {"Hardware", "CPU: ", "RAM: ", "GPU: ", "CPU Cooler: ", "Motherboard: ", "Storage: ", "Power Supply: ", "Peripherals", "Headset: ", "Keyboard: ", "Mouse: ", "Ergonomic Devices", "Desk: ", "Chair: ", "Foot Rest: ", "Wrist Rest: ", "Mouse Pad: ","Other", "Security Software: ", "Backup/Cloud Software: ", "Service Provider (Monthly): "};
        //Print title
        System.out.println("Ultimate Computer Workstation Builder");
        System.out.println("-------------------------------------");
        System.out.println(" ");
        //Cycle though "items"
        for (String x : items) {
            //Check if a string in "items" is a title or subtitle
            //Call input methods if a subtitle is detected
            if (x.contains(":") == true) {
                System.out.print(x);
                recordNamePrice(name, price, partsList, priceList);
            }else {
                //Otherwise print title and proceed to check the next value in the
                System.out.println(" ");
                System.out.println(x);
                System.out.println("^^^^^^^^^^^^^^^^^^");
            }
        }
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        //Ask user for discount
        boolean repeat=true;
        int discountPercent = 0;
        while(repeat){
            
            System.out.println("Discount (Whole number): ");
            try {
                discountPercent = input.nextInt();
                //If no errors occur break out of loop
                break;
            } catch (Exception e) {
                //If error is caught, ask user to re-enter discount value
                System.out.println("Invalid input please input a number");
                input.next();
            }
            input.close();
        }
        //Tell the user how the program has interpreted their input
        System.out.println("Discount = " + discountPercent + "%");
        System.out.println(" ");
        System.out.println("Parts List: ");
        //Iterate through "partsList" array and print each value
        for (String i : partsList) {
            System.out.println(i);
        }
        //Iterate through "priceList" and add each value to "totalCost" variable.
        double totalCost = 0.0;
        for (double i : priceList) {
            totalCost += i;
        }
        //Call calculate method
        calculateTotals(totalCost, discountPercent);
    }
}