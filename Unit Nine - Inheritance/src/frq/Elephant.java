package frq;

public class Elephant extends Herbivore{
    private double tuskLength;

    public Elephant(String name, double length){
        super("elephant", "percy");
        tuskLength = length; 
    }

    public String toString(){
        return super.toString() + " with tusks " + tuskLength + " meters long.";
    }
}
