package lesson2;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = new String("Hi");
        String s2 = "Hello";

        int strLength = s1.length();
        System.out.println(s1 + " has a length of " + strLength);
        System.out.println(s2 + " has a length of " + s2.length());

        String s = "llo";
        System.out.println("The index of " + s + " in " + s2 + " is " + s2.indexOf(s));

        String subString1 = s1.substring(5,8);  //For "bet"
        
    }
}
