import java.util.Scanner;
/**
 * This program will ask how much the customer spent. Use that information to then display which category they are in, how much they have saved, and the new total amount
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    //prompt the user for money spent
    System.out.println("Please enter the amount the customer spent");
    //get the amount spent from the user
    double moneySpent = input.nextDouble();

    if (moneySpent >= 0.01 && moneySpent <= 40.00){
      System.out.println("They will receive 10% off.");
      double saved10 = moneySpent*0.10;
      System.out.println("They will save $" + saved10 + ".");
      double total10 = moneySpent - saved10;
      System.out.println("The new total is $" + total10 + ".");
    } else if (moneySpent >= 40.01 && moneySpent <= 80.00){
      System.out.println("They will receive 20% off.");
      double saved20 = moneySpent*0.20;
      System.out.println("They will save $" + saved20 + ".");
      double total20 = moneySpent - saved20;
      System.out.println("The new total is $" + total20 + ".");
      } else if (moneySpent >= 80.01 && moneySpent <= 120.00){
      System.out.println("They will receive 30% off.");
      double saved30 = moneySpent*0.30;
      System.out.println("They will save $" + saved30 + ".");
      double total30 = moneySpent - saved30;
      System.out.println("The new total is $" + total30 + ".");
      } else if (moneySpent >= 120.01){
      System.out.println("They will receive 40% off.");
      double saved40 = moneySpent*0.40;
      System.out.println("They will save $" + saved40 + ".");
      double total40 = moneySpent - saved40;
      System.out.println("The new total is $" + total40 + ".");
      }
  }
}
