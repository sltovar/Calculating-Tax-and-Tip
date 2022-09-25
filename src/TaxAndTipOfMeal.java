//    CALCULATING TAX AND TIP OF A MEAL 
// 
//    A program that computes the tax and tip on a restaurant bill 
//    for a patron with a $44.50 meal charge. The tax is 8.25% of
//    the meal cost and the tip is 15% of the total after tax. 
//    The meal cost, tax amount, tip amount, and total bill are 
//    displayed as output. 

public class Program1
{

	public static void main(String[] args)
    {
       // Declaring the variables
	   double amount = 44.50;
	   double taxAmount = 0.0825 * amount;
	   double subTotal = amount + taxAmount;
	   double tipAmount = 0.15 * subTotal;
	   double totalAmount = subTotal + tipAmount;

      System.out.printf("Calculating the tax and tip of a meal...\n");
      // Print statements for the variables
      System.out.printf("Meal Cost:         %.2f%n", amount);
      System.out.printf("Tax Amount(8.25%%): %.2f%n", taxAmount);
      System.out.printf("Sub Total:         %.2f%n", subTotal);
      System.out.printf("Tip Amount(15%%):   %.2f%n", tipAmount);
      System.out.printf("Total Amount:      %.2f%n", totalAmount);

    } // End of the main method
	
}