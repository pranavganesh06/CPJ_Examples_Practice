public class Food
{
    private String name;
    private int calories;

    public Food (String foodName, int foodCalories){
        name = foodName;
        calories = foodCalories;
    }

    public String getName() {
        return name;
    }

    public void setName(String foodName) {
        name = foodName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int foodCalories) {
        calories = foodCalories;
    }

    public String toString() {
        return name + " have " + calories + " calories";
    }
}