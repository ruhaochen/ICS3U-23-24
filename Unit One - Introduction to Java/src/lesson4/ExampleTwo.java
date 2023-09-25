package lesson4;

public class ExampleTwo {
    public static void main(String[] args) {
        //int x = 6.7;        //cannot store a double in an int variable
        double y = 7;
        double z = 6.8; 
        
        int number = (int)z;    //can cast a double to an int; treats 6.8 as 6 
                                //loss of precision it is called a narrowing
    }
}
