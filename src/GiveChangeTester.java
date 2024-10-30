/**
 * Tests the GiveChange program.
 * @author Mr. Turner
 */
public class GiveChangeTester {
    public static void main(String[] args) {

        // Test 1: Due $17.95, Received $20
        System.out.println("Expected: 2 dollars, 1 nickel");
        System.out.println("Actual:");
        GiveChange.calculateChange(1795, 2000);

        System.out.println();

        // Test 2: Due $32.68, Received $45
        System.out.println("Expected: 12 dollars, 1 quarter, 1 nickel, 2 pennies");
        System.out.println("Actual:");
        GiveChange.calculateChange(3268, 4500);

        System.out.println();

        // Test 3: Due $18.10, Received $18.10
        System.out.println("Expected: 0");
        System.out.println("Actual:");
        GiveChange.calculateChange(1810, 1810);
    }
}
