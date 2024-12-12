package module2_exam_practice;

/**
 Test class for the Bug class.
 */
public class BugTester
{
    public static void main(String [] args)
    {
        Bug mrKalman = new Bug(1);
        mrKalman.move();
        mrKalman.move();
        mrKalman.move();
        mrKalman.turn();
        mrKalman.move();
        mrKalman.move();
        mrKalman.turn();
        mrKalman.move();

        System.out.println(mrKalman.getPosition());
        System.out.println("Expected: 3");
    }
}