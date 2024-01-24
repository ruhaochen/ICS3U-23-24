package lesson1;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        exampleOne();
    }

    private static void exampleOne(){
        ArrayList<String> words = new ArrayList<String>();


        // ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        // numbers.add(3);

        words.add("hi");
        words.add("bye"); 
        System.out.println(words.size()); 
        words.add("hello");
        words.add(1, "cough"); 
        // String s = words.set(2, "birds"); 
        // String t = words.remove(0);

        // int sum = 0;
        // for (int i = 0; i < words.size(); i++) {
        //     sum += words.get(i).length(); 
        // }

        // System.out.println(sum / words.size());

        int sum = 0; 

        for (String s : words){     // for each loop iterates through all elements of the list. 
            sum += s.length(); 
        }

        System.out.println(sum / words.size());
        
        //getting rid of any words that start with h

        // for (int i = 0; i < words.size(); i++) {
        //     if (words.get(i).substring(0 , 1).equals("h"))
        //         words.remove(i);
        //         i--; 
        // }

        for (int i = words.size(); i > 0; i--) {
            if (words.get(i).substring(0 , 1).equals("h"))
                words.remove(i);
        }

        for (String str : words) {
            System.out.println(str); 
        }

    }
}
