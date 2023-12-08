package lesson1;

public class StaticTest {
    public static void main(String[] args) {
        NumberList list1 = new NumberList(1, 2, 3);
        
        NumberList list2 = new NumberList(2, 3, 4);
    
        System.out.println(list1.getSum());
        System.out.println(list2.getSum());

        NumberList list3 = NumberList.joinLists(list1, list2);
        System.out.println(list3.getSum()); 
    }
}
