public class GroceryItem {
    private String name;
    private double price;
    private int stock;

    public GroceryItem(String name, double price, int stock) throws IllegalArgumentException {

        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Cost cannot be non-positive");
        }

        if (MathHelpers.hasMoreThanTwoDecimalPlaces(price)) {
            throw new IllegalArgumentException("Price cannot have more than two decimal places");
        }

        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }

        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
