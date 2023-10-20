package lesson3;

public class Homework {
    public static void main(String[] args) {
        //Question 1
        String tag = "<<>>";
        String word = "Hello";

        String result = tag.substring(0,2) + word + tag.substring(2); 
        System.out.println(result);

        //Question 2
        String evenLength = "HeeHaw";
        String firstHalf = evenLength.substring(0, evenLength.length()/2); 

        System.out.println(firstHalf);

        //Question 3
        String word1 = "Compsci";
        String withoutEnd = word1.substring(1, (word1.length()-1));

        System.out.println(withoutEnd);

        //Question 4 
        String a = "Coffee";
        String b = "Tea";

        String comboString = a+b+a;
        System.out.println(comboString); 

        //Question 5
        String c = "Hello";
        String d = "There";

        String nonStart = c.substring(1, c.length()) + d.substring(1, d.length());
        System.out.println(nonStart);

        //Question 6
        String word2 = "School";    
        String left2 = word2.substring(2, word2.length()) + word2.substring(0, 2);
        System.out.println(left2);

        //Question 7
        String word3 = "Holiday";    
        String right2 = word3.substring(word2.length()-2) + word3.substring(0, word2.length());
        System.out.println(right2);

        //Question 8
        String lengthOverTwo = "Water";
        String withoutEnd2 = lengthOverTwo.substring(0, 1) + lengthOverTwo.substring(lengthOverTwo.length()-1) + lengthOverTwo.substring(0, 1) + lengthOverTwo.substring(lengthOverTwo.length()-1);
        System.out.println(withoutEnd2);

        //Question 9
        String evenLength2 = "qwerty";
        String middleTwo = evenLength2.substring((evenLength2.length()/2)-1, evenLength2.length()-(evenLength2.length()/2-1));
        System.out.println(middleTwo);

        //Question 10 
        String word4 = "IceCream";
        int n = 3;
        String nTwice = word4.substring(0, n) + word4.substring(word4.length()-n);

        System.out.println(nTwice);

        //Question 11
        String word5 = "java";
        int index = 0;
        String twoChar = word5.substring(index, index+2); 

        System.out.println(twoChar);

        //Question 12
        String lengthoverThree = "alphabets"; 
        String middleThree = lengthoverThree.substring((lengthoverThree.length()-3)/2, (lengthoverThree.length()-3)/2+3);

        System.out.println(middleThree);

        //Question 13
        String word6 = "h"; 
        if (word6.length() == 1){
            System.out.println(word6 + "@");
        }else{
            System.out.println(word6.substring(0, 2));
        }

        //Question 14
        String word7 = "pasta";
        String word8 = "spaghetti";

        String lastChars = word7.substring(0, 1) + word8.substring(0, 1);
        System.out.println(lastChars);

        //Question 15
        String e = " basket";
        String f = "ball ";

        String conCat = e.substring(1, e.length()) + f.substring(0, f.length()-1);
        System.out.println(conCat);
        
    }
}
