import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;
public class Interest_Calculator {
    static void main() {
        Scanner input  = new Scanner(System.in);
        double rate, term, principal;
        System.out.print("Principal Amount:     ");
        principal = input.nextDouble();
        System.out.print("Interest Rate (%):        ");
        rate = input.nextDouble();
        System.out.print("Loan Term (months):        ");
        term = input.nextDouble();
        rate = rate/100;
        calculate(principal, term, rate);
        input.close();
    }
  
    static void calculate(double principal, double term, double rate) {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double total = (principal*(Math.pow((1+rate), (term))));
        System.out.print(money.format(total));
    }
  
      public static void main(String[] args) {
          main();
      }
}
