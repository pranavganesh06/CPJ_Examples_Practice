public class Bug {
    private int position;
    private int direction; // +1 = right, -1 = left

    // Constructor
    public Bug(int initialPosition) {
        position = initialPosition;
        direction = 1; // initially moving right
    }

    // Turn around (reverse direction)
    public void turn() {
        direction = -direction;
    }

    // Move one unit in the current direction
    public void move() {
        position += direction;
    }

    // Return current position
    public int getPosition() {
        return position;
    }
}
