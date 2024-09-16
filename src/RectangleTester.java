import java.awt.*;

//Lesson 11 Warm-Up
public class RectangleTester {
    public static void main(String[] args) {
        /* Create a Rectangle with a width of 12 and a height of 19 and
        whose upper-left corner is (-8, 5). */

        Rectangle box = new Rectangle(-8, 5, 12, 19);

        /* Print the results of calling the contains method on the
        previously created Rectangle object with the arguments (-8, 6). */
        System.out.println(box.contains(-8, 6));
    }
}
