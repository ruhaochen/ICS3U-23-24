package lesson1;

public class NumberList {
    private int num1;
    private int num2;
    private int num3;

    public NumberList (int a, int b, int c){
        num1 = a;
        num2 = b;
        num3 = c;
    }

    public int getSum(){
        return num1 + num2 + num3; 
    }

    public static NumberList joinLists(NumberList list1, NumberList list2){
        NumberList temp = new NumberList(list1.num1 + list2.num1, list1.num2 + list2.num2, list1.num3 + list2.num3);
        return temp; 
    }
}
