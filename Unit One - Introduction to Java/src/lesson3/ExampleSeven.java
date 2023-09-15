package lesson3;

public class ExampleSeven {
    public static void main(String[] args) {
        int numberOfStudents = 15;

        numberOfStudents = numberOfStudents + 3; // 18
        
        numberOfStudents += 3; // 21

        // compound assignment operators +=, -, %=, /=, *= 

        numberOfStudents ++; // 21
        numberOfStudents --; // 21

        numberOfStudents += 4; // 25
        numberOfStudents /= 3; // 8 
        numberOfStudents %= 2; // 0
        numberOfStudents++ ; // 1
        numberOfStudents*=4; // 4
        numberOfStudents--; // 3 
        
        System.out.println(numberOfStudents);
        
    }
}
