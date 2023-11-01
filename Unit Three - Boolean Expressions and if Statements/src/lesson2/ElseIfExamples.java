package lesson2;

public class ElseIfExamples {
    public static void main(String[] args) {
        // boolean isHappy = true;

        // if(isHappy){
        //     System.out.println("I am glad you are happy on Halloween!");
        // }else{
        //     System.out.println("Sorry you are not happy!");
        // }

        // //is the same as: 

        // if(isHappy)
        //     System.out.println("I am glad youa re happy on Halloween!");
        // else
        //     System.out.println("Sorry you are not happy!");

        // //This also works: 
        
        // if(isHappy)
        //     System.out.println("I am glad youa re happy on Halloween!");
        // else if (!isHappy)
        //     System.out.println("Sorry you are not happy!");
    
        int mark = 98;

        if(mark>=80)
            System.out.println("A");
        else if(mark>=70)
            System.out.println("B");
        else if(mark>=60)
            System.out.println("C");
        else if(mark>=5)
            System.out.println("D");
        else
            System.out.println("F");

    }
}
