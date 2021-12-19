import java.util.*;
import java.util.concurrent.*;
public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;
    public WaitList(Collection<E> c) {
        content=new ConcurrentLinkedQueue<E>(c);
    }
    public WaitList() {
        content=new ConcurrentLinkedQueue<E>();
    }
    public void add(E element) {

        content.add(element);
    }
    public E remove() {
        return content.poll();
    }
    public boolean contains(E element) {
        return content.contains(element);
    }
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }
    public boolean isEmpty() {
        return content.isEmpty();
    }
    public String toString() {
        return "Список ожидания: "+this.content;
    }
}
