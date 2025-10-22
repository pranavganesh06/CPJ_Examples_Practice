// MilitaryTimeECTester.java
// (Exactly what you gave)
public class MilitaryTimeECTester {
    public static void main(String[] args) {

        // Test 1
        System.out.println("Expected: 1 hours 0 minutes");
        System.out.println("Actual:   " +
                MilitaryTimeEC.calculateTimeDifference(1250, 1350));

        System.out.println();

        // Test 2
        System.out.println("Expected: 21 hours 48 minutes");
        System.out.println("Actual:   " +
                MilitaryTimeEC.calculateTimeDifference(128, 2316));

        System.out.println();

        // Test 3
        System.out.println("Expected: 11 hours 51 minutes");
        System.out.println("Actual:   " +
                MilitaryTimeEC.calculateTimeDifference(1941, 732));

    }
}
