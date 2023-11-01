package lesson2;

public class CompoundBooleanExpressions {
    public static void main(String[] args) {
        boolean isHappy = true;
        boolean hasRedShoes = false;
        
        //System.out.println(isHappy && hasRedShoes);
        // && is true only when both are true
        // false otherwise

        // System.out.println(true && true);
        // System.out.println(true && false);
        // System.out.println(false && true);  // don't need to evaluate the right side becuase false && anything is false
        // System.out.println(false && false);

        System.out.println(true || true);   // short circuit because only one needs to be true and true || is enough
        System.out.println(true || false);
        System.out.println(false || true);  
        System.out.println(false || false);
    }
}
