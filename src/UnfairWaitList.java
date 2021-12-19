import java.util.*;
import java.util.concurrent.*;
public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        content=new ConcurrentLinkedQueue<E>();
    }
    public void remove(E element) {
        ConcurrentLinkedQueue<E> content1=new ConcurrentLinkedQueue<E>(); // временная очередь
        if (content.peek()==element) return;
        while (content.peek()!=null) {
            if (content.peek()!=element)
                content1.add(content.poll());
            else content.poll();


        }
        content=content1;


    }
    public void moveToBack(E element) {
        content.remove(element);
        content.add(element);
    }


}
