package module2_exam_practice;

/**
 A class for a customer in a store that discounts $10 on the next purchase after $100 in purchases.
 */
public class Customer {
    private double total;
    private double discountTally;

    public Customer() {
        this.total = 0;
        this.discountTally = 0;
    }


    public Customer(double total, double discountTally) {
        this.total = total;
        this.discountTally = discountTally;
    }

    public void makePurchase(double amount) {
        if (discountReached()) {
            total = total + amount - 10.0;
            discountTally = amount - 10.0;
        } else {
            total = total + amount;
            discountTally = discountTally + amount;
        }
    }

    public boolean discountReached() {
        if (discountTally >= 100) {
            return true;
        } else {
            return false;
        }
    }

    public double getTotal() {return total;}

}