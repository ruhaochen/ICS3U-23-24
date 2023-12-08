package lesson3;
public class Idk {
    public static void main(String[] args) {
        //printNums(5, 4);
        longestStreak("CCAAAAATTT");
    }

    private static void longestStreak(String str) {
        int count = 0;
        int streak = 0;
        String s = "";
        for (int i = 0; i < str.length()-1; i++){
            String letter = str.substring(i, i + 1);
            if (letter.equals(str.substring(i + 1, i + 2))){
                count++;
                if (count > streak){
                    streak = count;
                    s = letter;
                }
            }else{
                count = 0;
            }
        }
        System.out.println(s + " " + streak);
    }

    private static void printNums(int value, int numRounds) {
        for (int i = 0; i < numRounds; i++){
            int randomNum = (int)(Math.random()*10);
            while (value != randomNum){
                System.out.print(randomNum);
                randomNum = (int)(Math.random()*10);
            }
            System.out.print(randomNum);
            System.out.println();
        }
    }
}
