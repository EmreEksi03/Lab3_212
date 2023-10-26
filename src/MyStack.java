import java.util.*;

public class MyStack<T> {
    private Queue<T> queue = new LinkedList<>();

    public void push(T t){
        queue.add(t);
    }
    public T pop(){
        Queue<T> newQueue = new LinkedList<>();
        int size = queue.size();
        for (int i = 0; i< size-1; i++)
            newQueue.add(queue.poll());
        T result = queue.poll();
        while (!newQueue.isEmpty())
            queue.add(newQueue.poll());
        return result;
    }
    public T peek(){
        Queue<T> newQueue = new LinkedList<>();
        int size = queue.size();
        for (int i = 0; i< size-1; i++)
            newQueue.add(queue.poll());
        T result = queue.poll();
        newQueue.add(result);
        while (!newQueue.isEmpty())
            queue.add(newQueue.poll());
        return result;
    }

    @Override
    public String toString() {
        return queue.toString();
    }

    public void reverse() {
        MyStack<T> temp = new MyStack<>();
        while (!queue.isEmpty())
        {
            temp.push(pop());
        }
        while (!temp.queue.isEmpty())
        {
            queue.add(temp.queue.remove());
        }
    }

    public int search(T t) {
        int index = 0;
        int result = Integer.MAX_VALUE;
        for (Iterator<T> iterator = queue.iterator(); iterator.hasNext(); ) {
            T t1 = iterator.next();
            if (t1.equals(t) && queue.size()-index<result)
                result = queue.size()-index;
            index++;
        }
        return result == Integer.MAX_VALUE? -1:result ;
    }

    public T findMultiple(){
        HashMap<T, Integer> map = new HashMap<>();

        for (T t : queue) {
            map.put(t, map.get(t)==null? 1:map.get(t)+1);
        }
        //Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        return null;
    }
}
