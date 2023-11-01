package lesson1;

public class IfStatementExample {
    public static void main(String[] args) {
        boolean isHappy = true;
        boolean hasBlueShoes = false;
        int x = 12; 

        if (isHappy){
            System.out.println("Good.");
        }else{
            System.out.println("Be happy");
        }

        System.out.println("Today it is raining");

        if(!hasBlueShoes){
            System.out.println("You ain't wearing no drip");
            System.out.println("HOW DARE YOU!");
        }

        if(isHappy) //no {} then the next line is part of the if and only the next line 
            System.out.println("I am glad you are happy.");
            System.out.println("Sometimes it is hard to be happy in the rain.");

        if(x>0)
            System.out.println(x + " is positive.");
        if(x%2 == 0)
            System.out.println(x + "is even."); 
    }
}
