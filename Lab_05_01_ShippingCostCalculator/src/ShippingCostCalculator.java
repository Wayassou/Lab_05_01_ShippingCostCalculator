import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double itemPrice = input.nextDouble();
        double shippingCost;

        // Determine shipping cost
        if (itemPrice > 100) {
            shippingCost = 0; // Free shipping
        } else {
            shippingCost = 10; // Flat rate for items under $100
        }

        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Shipping Cost: $" + shippingCost);
    }
}
