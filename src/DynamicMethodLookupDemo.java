import java.util.ArrayList;
public class DynamicMethodLookupDemo {
    public static void main(String[] args){
        ArrayList<String> woods = new ArrayList();
        woods.add("oak");
        woods.add("mahogany");

        //Example 1 - Table object stored in a Table variable
        Table diningTableOne = new Table(woods, 4);
        System.out.println(diningTableOne);
        System.out.println("Class: " + diningTableOne.getClass());
        System.out.println("Is Table: " + (diningTableOne instanceof Table));
        System.out.println("Is Furniture: " + (diningTableOne instanceof Furniture));
        System.out.println("Is Object: " + (diningTableOne instanceof Object));
        System.out.println();

        //Example 2 - Table object stored in a Furniture object
        Furniture diningTableTwo = new Table(woods, 4);
        System.out.println(diningTableTwo);
        System.out.println("Class: " + diningTableTwo.getClass());
        System.out.println("Is Table: " + (diningTableTwo instanceof Table));
        System.out.println("Is Furniture: " + (diningTableTwo instanceof Furniture));
        System.out.println("Is Object: " + (diningTableTwo instanceof Object));

        //Uncomment following line - why is there a compile time error?
        //System.out.printf("Legs: %d", diningTableTwo.getLegs());
    }
}
