import java.util.Scanner;
import java.text.NumberFormat;
public class Receipt_1 {
    public static void main(String[] args) {
        final double tax = 0.13;
        final double tip = 0.10;
        int price = 0;
        int subtotal = 0;
        int num = 1;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter 0 to end input\nEnter prices in ($): \n");
       
        while (true) {
            System.out.print("Item " + (num) + "\n      $");
            price = input.nextInt();
            if (price <= 0) {
                break;
            }
            subtotal = subtotal + price;
            num++;
        } 
        input.close();
        int totalTax = (int)(subtotal*tax);
        int totalTip = (int)(subtotal*tip);
        int total = (int)(subtotal + totalTax + totalTip);
        
        System.out.printf("%12s %4s" , "Cash", "Recieipt\n");
        System.out.printf("%12s %4s" , "--------------------------", "\n");
        System.out.printf("%12s %4.2s %2s","SubTotal" , money.format(subtotal),  "\n");
        System.out.printf("%12s %4.2s %2s","Tip" , money.format(totalTip),  "\n");
        System.out.printf("%12s %4.2s %2s","Tax" , money.format(totalTax),  "\n");
        System.out.printf("%12s %4.2s %2s","Total" , money.format(total),  "\n");
        System.out.printf("%12s %4s" , "--------------------------", "\n");
        System.out.printf("%12s %4s" , "Don't Come", "Again\n");
    }

}
