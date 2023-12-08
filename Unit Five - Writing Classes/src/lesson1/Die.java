package lesson1;

public class Die {
    private int topSide;
    private int numSides;

    /* We can have multiple methods/constrictors with the same name as long as they have a different argument */
    /* This is called "method overloading" */
    public Die (int numSides){
        this.numSides = numSides;
        roll();
    }
    
    public Die(){
        numSides = 6;
        roll();
    }

    /*
     * postcondition: Create a new Die with numSide and sets topSide to topSide.
     * precondition: topSide <= numSide
     */
    public Die(int numSides, int topSide){
        if (topSide > numSides)
            throw new IllegalArgumentException("Topside cannot be larger than " + numSides); 
        this.numSides = numSides;
        this.topSide = topSide; 
    }

    // Mutator Method because it changes the state of the instance/object.
    public void roll(){
        topSide = (int)(Math.random()*numSides) + 1;
    }

    // Accessor methods returns / retrieves the state of one of the attributes.
    public int getTopSide(){
        return topSide;
    }

    // mutator method -> changes the state
    public void setTopSide(int topSide){
        if (topSide > numSides)
            throw new IllegalArgumentException("Topside cannot be larger than " + numSides); 
        this.topSide = topSide; 
    }
}
