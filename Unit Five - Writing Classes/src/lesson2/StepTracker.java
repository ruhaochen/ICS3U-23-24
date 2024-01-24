package lesson2;

public class StepTracker {
    public static void main(String[] args) {
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }
    private int minSteps;
    private int numDays;
    private int numActiveDays;
    private int totalSteps;


    public StepTracker(int num){
        minSteps = num;
        numActiveDays = 0;
        numDays = 0;
        totalSteps = 0;
    }

    public int activeDays(){
        return numActiveDays;
    }

    public double averageSteps(){
        if (numDays == 0){
            return 0.0;
        }  
        return totalSteps/(double)numDays;
    }

    public void addDailySteps(int num){
        totalSteps += num;
        numDays ++;
        if (num >= minSteps){
            numActiveDays++;
        }
        
    }

}
