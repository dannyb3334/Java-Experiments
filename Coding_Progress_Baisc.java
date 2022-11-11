import java.util.Scanner;

public class Coding_Progress_Baisc {
    static void myMethod() {
      Scanner input  = new Scanner(System.in);

      System.out.println("Enter the number of minutes spent working on a project");
      System.out.println("");

      System.out.print("Designing: ");
      int designing = input.nextInt();
      System.out.print("Coding: ");
      int coding = input.nextInt();
      System.out.print("Debugging: ");
      int debugging = input.nextInt();
      System.out.print("Testing: ");
      int testing = input.nextInt();
      input.close();
      
      System.out.println("");
      int total = (designing + coding + debugging + testing);
      System.out.println("Total" + total + " min");
      System.out.println("Designing: " + ((float)(designing*100/total)) + "%"); 
      System.out.println("Coding: " + ((float)(coding*100/total)) + "%"); 
      System.out.println("Designing: " + ((float)(debugging*100/total)) + "%"); 
      System.out.println("Debugging: " + ((float)(testing*100/total)) + "%"); 
    }
  
    public static void main(String[] args) {
      myMethod();
    }
  }