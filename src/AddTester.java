import java.awt.*;

public class AddTester {
    //Use for exercise E2.4

    public static void main(String[] args){
        //Create the rectangle and add point
        Rectangle box = new Rectangle(5, 10, 20 ,30);
        box.add(0, 0);

        //Print the actual and expected results
        System.out.println("X: " + box.getX());
        System.out.println("Expected X: 0.0");

        System.out.println("Y: " + box.getY());
        System.out.println("Expected Y: 0.0");

        System.out.println("Height: " + box.getHeight());
        System.out.println("Expected Height: 40.0");

        System.out.println("Width: " + box.getWidth());
        System.out.println("Expected Width: 25.0");
    }
}
