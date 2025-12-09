import java.util.NoSuchElementException;
import java.util.Scanner;

public class GroceryInventory {
    public static void addGroceryItem() {
        Scanner input = new Scanner(System.in);
        GroceryItem item = null;

        while (item == null) {
            try {
                System.out.print("Enter name: ");
                String name = input.nextLine();

                System.out.print("Enter price: ");
                double price = input.nextDouble();

                System.out.print("Enter stock quantity: ");
                int stock = input.nextInt();
                input.nextLine();

                item = new GroceryItem(name, price, stock);
            }
            catch (NoSuchElementException e) {
                System.out.println("Not a valid number");
                if (input.hasNextLine()) input.nextLine();
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                if (input.hasNextLine()) input.nextLine();
            }
        }

        String status = (item.getStock() > 0) ? "in stock" : "out of stock";

        System.out.printf(
                "%s has been added with a price of $%.2f per unit. The item is %s.",
                item.getName(), item.getPrice(), status
        );

        input.close();
    }
}
