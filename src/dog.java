/**
 * Represents a basic dog that can fetch and speak.
 */
public class dog {
    private String speech = "Woof!";
    private String name = "Lunar";

    /**
     * Dog returns specified object
     * @param toy what was thrown to the dog
     * @return the object picked up by the dog
     */
    // run
    // catch
    public Object fetch(Object toy){
        return toy;

    }

    // speak

    /**
     * Prints the dog's speech to the console
     */
    public void speak(){
        System.out.println(speech);
    }
}
