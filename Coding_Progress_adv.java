import java.util.Scanner;

public class Coding_Progress_adv {
    static void myMethod() {
      int time;
      String[] titleArray = {"Designing: ", "Coding: ", "Debugging: ", "Testing: "};
      int[] dataArray = {0,1,2,3};

      System.out.println("Enter the number of minutes spent working on a project\n");
      Scanner input  = new Scanner(System.in);
      for(int i=0; i<titleArray.length; i++){
        System.out.print(titleArray[i]);
        time = input.nextInt();
        dataArray[i] = time;
        }
      input.close();
      calculate(titleArray, dataArray);
    }

    static void calculate(String[] titleArray, int[] dataArray) {
      int total = 0;
      for(int i=0; i<dataArray.length; i++){
        total += dataArray[i];
      }
      System.out.println("\nTotal: " + total + " min");
      for(int i=0; i<titleArray.length; i++){
        System.out.println(titleArray[i] + ((float)(dataArray[i]*100/total)) + "%");
      }
    }

    public static void main(String[] args) {
        myMethod();
    }
  }