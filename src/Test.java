import java.util.*;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        int a;
       /* LinkedList <Integer> q=new LinkedList<>();
        q.add(7);
        q.add(3);
        q.add(5);
        q.add(7);
        WaitList <Integer> list1=new WaitList<>(q);
        WaitList <Integer> list=new WaitList<>();
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(1);
        System.out.println(list);
        System.out.println(list1);
        // WaitList
        BoundedWaitList <Integer> list2=new BoundedWaitList<>(4);
        list2.add(3);
        list2.add(6);
        list2.add(9);
        list2.add(2);
        list2.add(5);
        System.out.println(list2);*/
        // BoundedWaitList
        UnfairWaitList <Integer> list3=new UnfairWaitList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(2);
        list3.add(5);
        list3.remove(2);
        list3.moveToBack(7);
        System.out.println(list3);


    }
}
