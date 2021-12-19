import java.util.*;
import java.util.concurrent.*;
public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    public BoundedWaitList(int capacity) {
        this.capacity=capacity;


    }

    public int getCapacity() {
        return capacity;
    }
    public void add(E element) {
        Iterator iterator = content.iterator();
        int k=0;
        for (int i=0;i<capacity;i++)
            if (iterator.hasNext()==true) {
                k+=1;
                iterator.next();
            }
        if (k==capacity) System.out.println("Список ожидания полностью заполнен");
        else content.add(element);

    }
    public String toString() {
        return "Вместимость списка ожидания: "+getCapacity()+". Список ожидания: "+this.content;
    }

}
