package AP_Exam_Practice; // Package declaration, if exists
// Import statements

public class Ball implements Comparable{ // Class declaration
    // Instance variables
    public static int BALL_COUNT = 0;
    double diameter;
    String color;

    // Constructor(s)
    public Ball(){
        diameter = 20;
        color = "red";
        BALL_COUNT++;
    }

    public Ball(double diameter, String color) {
        this.diameter = diameter;
        this.color = color;
        color = "red";
        BALL_COUNT++;
    }

    // Methods
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getDiameter() {return diameter;}
    public String getColor() {return color;}

    @Override
    public int compareTo(Object o) {
        Ball  b = (Ball) o;
        return (int) (this.diameter - b.diameter);
    }
}
