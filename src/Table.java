import java.util.ArrayList;

public class Table extends Furniture{
    private int legs;
    //Constructor with no arguments
    public Table(){
        super();
        this.legs = 4;
    }

    //Overloaded constructor with arguments for materials and legs
    public Table(ArrayList<String> materials, int legs){
        super(materials);
        this.legs = legs;
    }

    public void setLegs(int legs){this.legs = legs; }
    public int getLegs(){return legs;}
}
